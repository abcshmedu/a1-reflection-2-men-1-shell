package edu.hm.cs.swa.renderer;

import java.lang.reflect.Array;

/**
 * Arrayrenderer for rendering any type of arrays.
 */
public class ArrayRenderer {

    private Object obj;


    /**
     * constructor.
     *
     * @param obj the object to render
     */
    public ArrayRenderer(Object obj) {
        this.obj = obj;
    }


    /**
     * render method for arrays.
     *
     * @return a String that represents the array.
     * @throws Exception any exception will be thrown
     */
    public String render() throws Exception {
        String tmp = "(Type " + obj.getClass().getTypeName() + ") [";
        for (int i = 0; i < Array.getLength(obj); i++) {
            tmp += Array.get(obj, i) + ", ";
        }
        tmp += "]\n";
        return tmp;
    }
}
