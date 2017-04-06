package edu.hm.cs.swa.prakt1;

import edu.hm.cs.swa.renderer.Renderer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * @author Johannes Seidel/Michael Reile. Parameterized runner Testclass.
 */
@RunWith(Parameterized.class)
public class RendererTest {
    private Renderer renderer;

    private String expectedResult;

    private static final int THREE = 3;

    private static final int FOUR = 4;


    /**
     * Constructor.
     *
     * @param expectedResult expected result for assertion.
     * @param toRender       SomeClass to render.
     */
    public RendererTest(String expectedResult, SomeClass toRender) {
        this.renderer = new Renderer(toRender);
        this.expectedResult = expectedResult;
    }

    // @Before
    // public void setUp() {
    // toRender = new SomeClass(5);
    // renderer = new Renderer(toRender);
    // }


    /**
     * Example parameters for assertEquals.
     *
     * @return ArrayList with possible answers.
     */
    @Parameterized.Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][]{{
                "Instance of edu.hm.cs.swa.prakt1.SomeClass:\n" + "someMethod: 4\n"
                +
                "foo (Type int): 0\narray (Type int[]) [1, 2, 3, ]\ndate (Type class java.util.Date): Fri Jan 02 11:17:36 CET 1970\n",
                new SomeClass(0)},
                {
                        "Instance of edu.hm.cs.swa.prakt1.SomeClass:\n" + "someMethod: 4\n"
                        +
                        "foo (Type int): 1\narray (Type int[]) [1, 2, 3, ]\ndate (Type class java.util.Date): Fri Jan 02 11:17:36 CET 1970\n",
                        new SomeClass(1)},
                {"Instance of edu.hm.cs.swa.prakt1.SomeClass:\n" + "someMethod: 4\n"
                 +
                 "foo (Type int): 2\narray (Type int[]) [1, 2, 3, ]\ndate (Type class java.util.Date): Fri Jan 02 11:17:36 CET 1970\n",
                        new SomeClass(2)},
                {"Instance of edu.hm.cs.swa.prakt1.SomeClass:\n" + "someMethod: 4\n"
                 +
                 "foo (Type int): 3\narray (Type int[]) [1, 2, 3, ]\ndate (Type class java.util.Date): Fri Jan 02 11:17:36 CET 1970\n",
                        new SomeClass(THREE)},
                {"Instance of edu.hm.cs.swa.prakt1.SomeClass:\n" + "someMethod: 4\n"
                 +
                 "foo (Type int): 4\narray (Type int[]) [1, 2, 3, ]\ndate (Type class java.util.Date): Fri Jan 02 11:17:36 CET 1970\n",
                        new SomeClass(FOUR)}});
    }


    /**
     * Test for Renderer.
     *
     * @throws Exception is thrown.
     */
    @Test
    public void testRendering() throws Exception {
        assertEquals(expectedResult, renderer.render());
    }
}
