package edu.hm.cs.swa.prakt1;

import edu.hm.cs.swa.renderer.RenderMe;

import java.util.Date;

/**
 * Created by CaptainEinsicht on 28.03.2017.
 * Alle Rechte vorbehalten bei Missbrauch wird zur�ck Missbraucht
 */
public class SomeClass {

    @RenderMe
    private int foo;

    @RenderMe(with = "edu.hm.cs.swa.renderer.ArrayRenderer")
    private int[] array = {1, 2, 3};

    @RenderMe
    private Date date = new Date(123456789);


    /**
     * Constructor for SomeClass.
     *
     * @param foo some foo
     */
    public SomeClass(int foo) {
        this.foo = foo;
    }

}
