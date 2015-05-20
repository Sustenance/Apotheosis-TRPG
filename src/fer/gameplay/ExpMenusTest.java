package fer.gameplay;

import org.junit.*;
import fer.ui.Menu;
import fer.Unit;
import fer.util.UnitData;
import static org.junit.Assert.*;

/**
 * The class <code>ExpMenusTest</code> contains tests for the class <code>{@link ExpMenus}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:27 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class ExpMenusTest {
	/**
	 * Run the void drawAttackerExpMenu(int,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testDrawAttackerExpMenu_1()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);
		int gain = 1;
		Unit attacker = new Unit(new UnitData());

		fixture.drawAttackerExpMenu(gain, attacker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void drawAttackerExpMenu(int,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testDrawAttackerExpMenu_2()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu((Menu) null);
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);
		int gain = 1;
		Unit attacker = new Unit(new UnitData());

		fixture.drawAttackerExpMenu(gain, attacker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void drawDefenderExpMenu(int,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testDrawDefenderExpMenu_1()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);
		int gain = 1;
		Unit defender = new Unit(new UnitData());

		fixture.drawDefenderExpMenu(gain, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void drawDefenderExpMenu(int,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testDrawDefenderExpMenu_2()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu((Menu) null);
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);
		int gain = 1;
		Unit defender = new Unit(new UnitData());

		fixture.drawDefenderExpMenu(gain, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the Menu getAttackerExpMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetAttackerExpMenu_1()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);

		Menu result = fixture.getAttackerExpMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the boolean getAttackerExpOpen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetAttackerExpOpen_1()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);

		boolean result = fixture.getAttackerExpOpen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
		assertTrue(result);
	}

	/**
	 * Run the boolean getAttackerExpOpen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetAttackerExpOpen_2()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(false);
		fixture.setDefenderExpOpen(true);

		boolean result = fixture.getAttackerExpOpen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
		assertTrue(result);
	}

	/**
	 * Run the Menu getDefenderExpMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetDefenderExpMenu_1()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);

		Menu result = fixture.getDefenderExpMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the boolean getDefenderExpOpen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetDefenderExpOpen_1()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);

		boolean result = fixture.getDefenderExpOpen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
		assertTrue(result);
	}

	/**
	 * Run the boolean getDefenderExpOpen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetDefenderExpOpen_2()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(false);

		boolean result = fixture.getDefenderExpOpen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
		assertTrue(result);
	}

	/**
	 * Run the void setAttackerExpMenu(Menu) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetAttackerExpMenu_1()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);
		Menu attackerExpMenu = new Menu(1, 1, 1, 1);

		fixture.setAttackerExpMenu(attackerExpMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void setAttackerExpOpen(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetAttackerExpOpen_1()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);
		boolean attackerExpOpen = true;

		fixture.setAttackerExpOpen(attackerExpOpen);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void setDefenderExpMenu(Menu) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetDefenderExpMenu_1()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);
		Menu defenderExpMenu = new Menu(1, 1, 1, 1);

		fixture.setDefenderExpMenu(defenderExpMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void setDefenderExpOpen(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetDefenderExpOpen_1()
		throws Exception {
		ExpMenus fixture = new ExpMenus();
		fixture.setDefenderExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpMenu(new Menu(1, 1, 1, 1));
		fixture.setAttackerExpOpen(true);
		fixture.setDefenderExpOpen(true);
		boolean defenderExpOpen = true;

		fixture.setDefenderExpOpen(defenderExpOpen);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
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
	 * @generatedBy CodePro at 5/19/15 11:27 PM
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
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ExpMenusTest.class);
	}
}