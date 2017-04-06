package edu.hm.cs.swa.renderer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * some Annotation options.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})

public @interface RenderMe {

    /**
     * @return String of a class location oder default value "".
     */
    String with() default "";
}
