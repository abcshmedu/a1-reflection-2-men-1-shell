package edu.hm.cs.swa.renderer;

import edu.hm.cs.swa.prakt1.SomeClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 */
public class Renderer {

    private Object toRender;


    /**
     * @param obj the object you want to render.
     */
    public Renderer(Object obj) {
        toRender = obj;
    }


    /**
     * @return an Object representing String.
     * @throws ClassNotFoundException
     */
    public String render() throws Exception {
        String tmp = "Instance of " + toRender.getClass().getName() + ":\n";
        Field[] fields = toRender.getClass().getDeclaredFields();
        for (Field a : fields) {
            a.setAccessible(true);
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
        return tmp;





        /*int tests = 0, successes = 0, failures = 0;
        Class<?> cut = Class.forName(toRender.getName());
        Method[] methods = cut.getMethods();
        for (Method method : methods) {
            if (method.getAnnotation(org.junit.Test.class) != null) {
                tests++;
                Object ott = cut.getConstructor().newInstance();
                try {
                    method.invoke(ott);
                    successes++;
                } catch (InvocationTargetException e) {
                    failures++;
                }
            }
        }
        return "Total tests: " + tests + " Successes: " + successes + " Failures: " + failures;*/
    }

}
