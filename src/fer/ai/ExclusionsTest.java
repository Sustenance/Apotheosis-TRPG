package fer.ai;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExclusionsTest</code> contains tests for the class <code>{@link Exclusions}</code>.
 *
 * @generatedBy CodePro at 5/18/15 4:23 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class ExclusionsTest {
	/**
	 * Run the Exclusions() constructor test.
	 *
	 * @generatedBy CodePro at 5/18/15 4:23 PM
	 */
	@Test
	public void testExclusions_1()
		throws Exception {
		Exclusions result = new Exclusions();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int getExcludeX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:23 PM
	 */
	@Test
	public void testGetExcludeX_1()
		throws Exception {
		Exclusions fixture = new Exclusions();
		fixture.setExcludeCollision(1, 1);

		int result = fixture.getExcludeX();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getExcludeY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:23 PM
	 */
	@Test
	public void testGetExcludeY_1()
		throws Exception {
		Exclusions fixture = new Exclusions();
		fixture.setExcludeCollision(1, 1);

		int result = fixture.getExcludeY();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setExcludeCollision(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:23 PM
	 */
	@Test
	public void testSetExcludeCollision_1()
		throws Exception {
		Exclusions fixture = new Exclusions();
		fixture.setExcludeCollision(1, 1);
		int x = 1;
		int y = 1;

		fixture.setExcludeCollision(x, y);

		// add additional test code here
	}

	/**
	 * Run the void setExcludeX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:23 PM
	 */
	@Test
	public void testSetExcludeX_1()
		throws Exception {
		Exclusions fixture = new Exclusions();
		fixture.setExcludeCollision(1, 1);
		int excludeX = 1;

		fixture.setExcludeX(excludeX);

		// add additional test code here
	}

	/**
	 * Run the void setExcludeY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:23 PM
	 */
	@Test
	public void testSetExcludeY_1()
		throws Exception {
		Exclusions fixture = new Exclusions();
		fixture.setExcludeCollision(1, 1);
		int excludeY = 1;

		fixture.setExcludeY(excludeY);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/15 4:23 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/15 4:23 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/18/15 4:23 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ExclusionsTest.class);
	}
}