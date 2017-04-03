package edu.hm.cs.swa.renderer;

import edu.hm.cs.swa.prakt1.SomeClass;

import java.lang.annotation.Annotation;

/**
 *
 */
public class Renderer implements RenderMe {

    private Class toRender;


    /**
     * @param obj the object you want to render.
     */
    Renderer(Object obj) {
        toRender = obj.getClass();
    }


    /**
     * @return an Object representing String.
     */
    public String render() {

        return "" + toRender.getFields().length;
    }


    /**
     * main.
     *
     * @param args irgendtein arg halt diego
     */
    public static void main(String[] args) {

        final int bla = 5;
        SomeClass test = new SomeClass(bla);
        Renderer renderer = new Renderer(test);
        System.out.println(renderer.render());
    }


    /**
     *
     * @return
     */
    public String with() {
        return null;
    }


    /**
     *
     * @return annotationtype.
     */
    public Class< ?  extends Annotation> annotationType() {
        return null;
    }
}
