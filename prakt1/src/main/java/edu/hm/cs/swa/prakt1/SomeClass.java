package edu.hm.cs.swa.prakt1;

import edu.hm.cs.swa.renderer.RenderMe;

import java.util.Date;

/**
 * An exampleclass for testing the Renderer.
 */
public class SomeClass {

    private final int numberOne = 1;

    private final int numberTwo = 2;

    private final int numberThree = 3;

    private final int dateNumber = 123456789;

    @RenderMe
    private int foo;

    @RenderMe(with = "edu.hm.cs.swa.renderer.ArrayRenderer")
    private int[] array = {numberOne, numberTwo, numberThree};

    @RenderMe
    private Date date = new Date(dateNumber);


    /**
     * Constructor for SomeClass.
     *
     * @param foo some foo
     */
    public SomeClass(int foo) {
        this.foo = foo;
    }


    /**
     * A Test Method to Render just return the value 4.
     *
     * @return always the value 4.
     */
    @RenderMe
    public int someMethod() {
        final int returnValue = 4;
        return returnValue;
    }

}
