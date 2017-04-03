package edu.hm.cs.swa.renderer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * keine ahnung warum ich das kommentieren soll.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})

public @interface RenderMe {

    /**
     * die render Methode die das rendern ermöglicht.
     */
    void render();

    /**
     * die with Methode die das withen ermöglicht.
     *
     * @return
     */
    String with();
}
