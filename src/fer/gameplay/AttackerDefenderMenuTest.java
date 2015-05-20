package fer.gameplay;

import org.junit.*;
import fer.ui.MenuAction;
import fer.ui.Menu;
import fer.Unit;
import fer.util.UnitData;
import static org.junit.Assert.*;

/**
 * The class <code>AttackerDefenderMenuTest</code> contains tests for the class <code>{@link AttackerDefenderMenu}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:30 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class AttackerDefenderMenuTest {
	/**
	 * Run the void addArmorMenuOptions(Unit,MenuAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testAddArmorMenuOptions_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		Unit unit = new Unit(new UnitData());
		unit.setArmor(new Armor(1));
		MenuAction sa = null;

		fixture.addArmorMenuOptions(unit, sa);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void addBattleMenuOptions(MenuAction,int,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testAddBattleMenuOptions_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		MenuAction sa = null;
		int damage = 1;
		float acc = 1.0f;
		float crit = 1.0f;

		fixture.addBattleMenuOptions(sa, damage, acc, crit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void addDefaultMenuOptions(Unit,MenuAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testAddDefaultMenuOptions_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		Unit unit = new Unit(new UnitData());
		unit.setHp(1);
		unit.setCurrentHp(1);
		MenuAction sa = null;

		fixture.addDefaultMenuOptions(unit, sa);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void addWeaponMenuOptions(Unit,MenuAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testAddWeaponMenuOptions_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		Unit unit = new Unit(new UnitData());
		MenuAction sa = null;

		fixture.addWeaponMenuOptions(unit, sa);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void clearMenus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testClearMenus_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);

		fixture.clearMenus();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void clearMenus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testClearMenus_2()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = null;
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);

		fixture.clearMenus();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the Menu getBattleMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testGetBattleMenu_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);

		Menu result = fixture.getBattleMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the Menu getMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testGetMenu_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);

		Menu result = fixture.getMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the MenuAction getSAAction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testGetSAAction_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);

		MenuAction result = fixture.getSAAction();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the Menu getStatusMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testGetStatusMenu_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);

		Menu result = fixture.getStatusMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the Menu getWeaponMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testGetWeaponMenu_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);

		Menu result = fixture.getWeaponMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the void setBattleMenu(Menu) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testSetBattleMenu_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		Menu battleMenu = new Menu(1, 1, 1, 1);

		fixture.setBattleMenu(battleMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void setMenu(Menu) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testSetMenu_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		Menu menu = new Menu(1, 1, 1, 1);

		fixture.setMenu(menu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void setStatusMenu(Menu) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testSetStatusMenu_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		Menu statusMenu = new Menu(1, 1, 1, 1);

		fixture.setStatusMenu(statusMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void setWeaponMenu(Menu) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:30 PM
	 */
	@Test
	public void testSetWeaponMenu_1()
		throws Exception {
		AttackMenus fixture = new AttackMenus();
		fixture.defaultMenu = new Menu(1, 1, 1, 1);
		fixture.statusMenu = new Menu(1, 1, 1, 1);
		fixture.battleMenu = new Menu(1, 1, 1, 1);
		fixture.weaponMenu = new Menu(1, 1, 1, 1);
		Menu weaponMenu = new Menu(1, 1, 1, 1);

		fixture.setWeaponMenu(weaponMenu);

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
		new org.junit.runner.JUnitCore().run(AttackerDefenderMenuTest.class);
	}
}