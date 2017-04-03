package edu.hm.cs.swa.renderer;

import java.lang.reflect.*;

import edu.hm.cs.swa.prakt1.SomeClass;

/**
 *
 */
public class Renderer {

    private Class toRender;

    /**
     * @param obj the object you want to render.
     */
    public Renderer(Object obj) {
        toRender = obj.getClass();
    }


    /**
     * @return an Object representing String.
     * @throws ClassNotFoundException 
     */
    public String render() throws Exception {
    	int tests = 0, successes = 0, failures = 0;
    	Class<?> cut = Class.forName(toRender.getName());
    	Method[] methods = cut.getMethods();
    	for (Method method : methods) {
    		if (method.getAnnotation(org.junit.Test.class) != null) {
    			tests++;
    			Object ott = cut.getConstructor().newInstance();
    			try {
    				method.invoke(ott);
    				successes++;
    			} catch(InvocationTargetException e) {
    				failures++;
    			}
    		}
    	}
        return "Total tests: " + tests + " Successes: " + successes + " Failures: " + failures;
    }
}
