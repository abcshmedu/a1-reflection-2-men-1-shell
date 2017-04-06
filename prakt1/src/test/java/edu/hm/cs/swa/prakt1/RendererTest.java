package edu.hm.cs.swa.prakt1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.hm.cs.swa.renderer.*;

@RunWith(Parameterized.class)
public class RendererTest {
	private SomeClass toRender;
	private Renderer renderer;
	private Integer inputNumber;
	private String expectedResult;
	
	public RendererTest(String expectedResult, SomeClass toRender) {
		this.renderer = new Renderer(toRender);
		this.expectedResult = expectedResult;
	}
	
//	@Before
//	public void setUp() {
//		toRender = new SomeClass(5);
//		renderer = new Renderer(toRender);
//	}

	@Parameterized.Parameters
	public static Collection<Object[]> params() {
		return Arrays.asList(new Object[][] { {
				"Instance of edu.hm.cs.swa.prakt1.SomeClass:\n"
						+ "foo (Type int): 0\narray (Type int[]) [1, 2, 3, ]\ndate (Type class java.util.Date): Fri Jan 02 11:17:36 CET 1970\n",
				new SomeClass(0) },
				{
						"Instance of edu.hm.cs.swa.prakt1.SomeClass:\n"
								+ "foo (Type int): 1\narray (Type int[]) [1, 2, 3, ]\ndate (Type class java.util.Date): Fri Jan 02 11:17:36 CET 1970\n",
						new SomeClass(1) },
				{ "Instance of edu.hm.cs.swa.prakt1.SomeClass:\n"
						+ "foo (Type int): 2\narray (Type int[]) [1, 2, 3, ]\ndate (Type class java.util.Date): Fri Jan 02 11:17:36 CET 1970\n",
						new SomeClass(2) },
				{ "Instance of edu.hm.cs.swa.prakt1.SomeClass:\n"
						+ "foo (Type int): 3\narray (Type int[]) [1, 2, 3, ]\ndate (Type class java.util.Date): Fri Jan 02 11:17:36 CET 1970\n",
						new SomeClass(3) },
				{ "Instance of edu.hm.cs.swa.prakt1.SomeClass:\n"
						+ "foo (Type int): 4\narray (Type int[]) [1, 2, 3, ]\ndate (Type class java.util.Date): Fri Jan 02 11:17:36 CET 1970\n",
						new SomeClass(4) } });
	}

	@Test
	public void testRendering() throws Exception {
		assertEquals(
				expectedResult, renderer.render());
	}
}
