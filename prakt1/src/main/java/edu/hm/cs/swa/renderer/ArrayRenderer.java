package edu.hm.cs.swa.renderer;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class ArrayRenderer {

	private Object obj;
	
    public ArrayRenderer(Object obj) {
    	this.obj = obj;
    }
    
    public String render() throws Exception{
    	String tmp = "(Type " + obj.getClass().getTypeName() + ") [";
    	for (int i = 0; i < Array.getLength(obj); i++) {
    		tmp += Array.get(obj, i) + ", ";
    	}
    	return tmp += "]\n";
    }
}
