package edu.hm.cs.swa.renderer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Class toRender Objects.
 */
public class Renderer {

	private Object toRender;

	/**
	 * @param obj
	 *            the object you want to render.
	 */
	public Renderer(Object obj) {
		toRender = obj;
	}

	/**
	 * @return an Object representing String.
	 * @throws Exception
	 *             FileNotFoundException
	 */
	public String render() throws Exception {
		String tmp = "Instance of " + toRender.getClass().getName() + ":\n";

		Method[] methods = toRender.getClass().getDeclaredMethods();
		for (Method meth : methods) {
			if (meth.getAnnotation(RenderMe.class) != null) {
				meth.setAccessible(true);

				tmp += meth.getName() + ": " + meth.invoke(toRender) + "\n";
			}
		}

		Field[] fields = toRender.getClass().getDeclaredFields();

		for (Field a : fields) {
			a.setAccessible(true);
			if (a.getAnnotation(RenderMe.class) != null) {
				if (!a.getAnnotation(RenderMe.class).with().equals("")) {
					tmp += a.getName() + " ";
					Class<?> anotherRenderer = Class.forName(a.getAnnotation(RenderMe.class).with());
					Object ott = anotherRenderer.getConstructor(Object.class).newInstance(a.get(toRender));
					Method method = anotherRenderer.getMethod("render", null);
					String s = (String) method.invoke(ott);
					tmp += s;
				} else {
					tmp += a.getName() + " (Type " + a.getType() + "): " + a.get(toRender) + "\n";
				}
			}
		}
		return tmp;
	}
}
