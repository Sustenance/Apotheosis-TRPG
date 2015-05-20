package fer.gameplay;

import org.junit.*;
import fer.Cursor;
import fer.ui.Menu;
import fer.graphics.Sprite;
import fer.Unit;
import fer.util.UnitData;
import static org.junit.Assert.*;

/**
 * The class <code>AttackMenusTest</code> contains tests for the class <code>{@link AttackMenus}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:29 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class AttackMenusTest {
	/**
	 * Run the void drawMenu(Cursor,Unit,int,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:29 PM
	 */
	@Test
	public void testDrawMenu_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		Cursor cursor = new Cursor();
		Unit attacker = new Unit(new UnitData());
		attacker.setArmor(new Armor(1));
		attacker.setName("");
		attacker.setMapFaceSprite(new Sprite(1, 1, 1, 1));
		int attackerDamage = 1;
		float accAttacker = 1.0f;
		float critAttacker = 1.0f;

		fixture.drawMenu(cursor, attacker, attackerDamage, accAttacker, critAttacker);

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
	 * @generatedBy CodePro at 5/19/15 11:29 PM
	 */
	@Test
	public void testDrawMenu_2()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		Cursor cursor = new Cursor();
		Unit attacker = new Unit(new UnitData());
		attacker.setArmor(new Armor(1));
		attacker.setName("");
		attacker.setMapFaceSprite(new Sprite(1, 1, 1, 1));
		int attackerDamage = 1;
		float accAttacker = 1.0f;
		float critAttacker = 1.0f;

		fixture.drawMenu(cursor, attacker, attackerDamage, accAttacker, critAttacker);

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
	 * @generatedBy CodePro at 5/19/15 11:29 PM
	 */
	@Test
	public void testInitializeMenus_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		Cursor cursor = new Cursor();
		cursor.setMapLocation(1, 1);
		cursor.setMapScroll(1, 1);

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
	 * @generatedBy CodePro at 5/19/15 11:29 PM
	 */
	@Test
	public void testInitializeMenus_2()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		Cursor cursor = new Cursor();
		cursor.setMapLocation(1, 1);
		cursor.setMapScroll(1, 1);

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
	 * @generatedBy CodePro at 5/19/15 11:29 PM
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
	 * @generatedBy CodePro at 5/19/15 11:29 PM
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
	 * @generatedBy CodePro at 5/19/15 11:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AttackMenusTest.class);
	}
}