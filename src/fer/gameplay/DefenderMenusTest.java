package fer.gameplay;

import org.junit.*;
import fer.Cursor;
import fer.ui.Menu;
import fer.graphics.Sprite;
import fer.Unit;
import fer.util.UnitData;
import static org.junit.Assert.*;

/**
 * The class <code>DefenderMenusTest</code> contains tests for the class <code>{@link DefenderMenus}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:30 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class DefenderMenusTest {
	/**
	 * Run the void drawMenu(Cursor,Unit,int,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testDrawMenu_1()
		throws Exception {
		DefenderMenus fixture = new DefenderMenus();
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		Cursor cursor = new Cursor();
		Unit defender = new Unit(new UnitData());
		defender.setArmor(new Armor(1));
		defender.setName("");
		defender.setMapFaceSprite(new Sprite(1, 1, 1, 1));
		int defenderDamage = 1;
		float accDefender = 1.0f;
		float critDefender = 1.0f;

		fixture.drawMenu(cursor, defender, defenderDamage, accDefender, critDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void drawMenu(Cursor,Unit,int,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testDrawMenu_2()
		throws Exception {
		DefenderMenus fixture = new DefenderMenus();
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		Cursor cursor = new Cursor();
		Unit defender = new Unit(new UnitData());
		defender.setArmor(new Armor(1));
		defender.setName("");
		defender.setMapFaceSprite(new Sprite(1, 1, 1, 1));
		int defenderDamage = 1;
		float accDefender = 1.0f;
		float critDefender = 1.0f;

		fixture.drawMenu(cursor, defender, defenderDamage, accDefender, critDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void initializeMenus(Cursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testInitializeMenus_1()
		throws Exception {
		DefenderMenus fixture = new DefenderMenus();
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		Cursor cursor = new Cursor();
		cursor.setMapScroll(1, 1);
		cursor.setMapLocation(1, 1);

		fixture.initializeMenus(cursor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void initializeMenus(Cursor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testInitializeMenus_2()
		throws Exception {
		DefenderMenus fixture = new DefenderMenus();
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		Cursor cursor = new Cursor();
		cursor.setMapScroll(1, 1);
		cursor.setMapLocation(1, 1);

		fixture.initializeMenus(cursor);

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
	 * @generatedBy CodePro at 5/19/15 11:30 PM
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
	 * @generatedBy CodePro at 5/19/15 11:30 PM
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
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DefenderMenusTest.class);
	}
}