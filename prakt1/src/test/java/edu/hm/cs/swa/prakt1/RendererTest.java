package edu.hm.cs.swa.prakt1;

import edu.hm.cs.swa.renderer.Renderer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Testclass for the Renderer.
 */
public class RendererTest {
    private SomeClass toRender;

    private Renderer renderer;

    private final int numberFive = 5;


    /**
     * initializes a instance for someclass and the renderer for the Tests.
     */
    @Before
    public void setUp() {
        toRender = new SomeClass(numberFive);
        renderer = new Renderer(toRender);
    }


    /**
     * A Test method for the rendering of instance from someclass.
     *
     * @throws Exception any Exception will be thrown
     */
    @Test
    public void testRendering() throws Exception {
        assertEquals(
                "Instance of edu.hm.cs.swa.prakt1.SomeClass:\n"
                +
                "foo (Type int): 5\narray (Type int[]) [1, 2, 3, ]\ndate (Type class java.util.Date): Fri Jan 02 11:17:36 CET 1970\n",
                renderer.render());
    }
}
