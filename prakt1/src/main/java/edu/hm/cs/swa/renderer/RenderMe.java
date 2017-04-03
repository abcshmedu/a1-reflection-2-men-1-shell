package edu.hm.cs.swa.renderer;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})

public @interface RenderMe {
	
	int value();

	String with();
	
	

}
