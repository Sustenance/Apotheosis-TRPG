package fer.gameplay;

import org.junit.*;
import fer.ui.Menu;
import fer.graphics.Sprite;
import static org.junit.Assert.*;

/**
 * The class <code>WeaponTest</code> contains tests for the class <code>{@link Weapon}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:28 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class WeaponTest {
	/**
	 * Run the Weapon(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testWeapon_1()
		throws Exception {
		int typeindex = 1;

		Weapon result = new Weapon(typeindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the void clearInfoMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testClearInfoMenu_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		fixture.clearInfoMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void drawInfoMenu(int,int,Menu,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testDrawInfoMenu_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		int x = 1;
		int y = 1;
		Menu callingMenu = new Menu(1, 1, 1, 1);
		boolean active = true;

		fixture.drawInfoMenu(x, y, callingMenu, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void drawInfoMenu(int,int,Menu,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testDrawInfoMenu_2()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		int x = 1;
		int y = 1;
		Menu callingMenu = new Menu(1, 1, 1, 1);
		boolean active = false;

		fixture.drawInfoMenu(x, y, callingMenu, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the int getAccuracy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetAccuracy_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		int result = fixture.getAccuracy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCritical() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetCritical_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		int result = fixture.getCritical();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertEquals(0, result);
	}

	/**
	 * Run the int getDamage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetDamage_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		int result = fixture.getDamage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertEquals(0, result);
	}

	/**
	 * Run the Sprite getIcon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetIcon_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		Sprite result = fixture.getIcon();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the int getMaxUses() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetMaxUses_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		int result = fixture.getMaxUses();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertEquals(0, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the int getPierce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetPierce_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		int result = fixture.getPierce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertEquals(0, result);
	}

	/**
	 * Run the int getRange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetRange_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		int result = fixture.getRange();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertEquals(0, result);
	}

	/**
	 * Run the int getUses() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetUses_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		int result = fixture.getUses();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetWeight_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		int result = fixture.getWeight();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean infoMenuDrawn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testInfoMenuDrawn_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		boolean result = fixture.infoMenuDrawn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertTrue(result);
	}

	/**
	 * Run the boolean infoMenuDrawn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testInfoMenuDrawn_2()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		boolean result = fixture.infoMenuDrawn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMelee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testIsMelee_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);

		boolean result = fixture.isMelee();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMelee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testIsMelee_2()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(false);
		fixture.setPierce(1);

		boolean result = fixture.isMelee();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
		assertTrue(result);
	}

	/**
	 * Run the void setAccuracy(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testSetAccuracy_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		int accuracy = 1;

		fixture.setAccuracy(accuracy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void setCritical(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testSetCritical_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		int critical = 1;

		fixture.setCritical(critical);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void setDamage(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testSetDamage_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		int damage = 1;

		fixture.setDamage(damage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void setIcon(Sprite) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testSetIcon_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		Sprite icon = new Sprite(1, 1, 1, 1);

		fixture.setIcon(icon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void setMaxUses(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testSetMaxUses_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		int maxUses = 1;

		fixture.setMaxUses(maxUses);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void setMelee(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testSetMelee_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		boolean melee = true;

		fixture.setMelee(melee);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		String name = "";

		fixture.setName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void setPierce(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testSetPierce_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		int pierce = 1;

		fixture.setPierce(pierce);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void setRange(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testSetRange_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		int range = 1;

		fixture.setRange(range);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void setUses(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testSetUses_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		int uses = 1;

		fixture.setUses(uses);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void setWeight(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testSetWeight_1()
		throws Exception {
		Weapon fixture = new Weapon(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		fixture.setAccuracy(1);
		fixture.setUses(1);
		fixture.setCritical(1);
		fixture.setDamage(1);
		fixture.setRange(1);
		fixture.setWeight(1);
		fixture.setName("");
		fixture.setMaxUses(1);
		fixture.setMelee(true);
		fixture.setPierce(1);
		int weight = 1;

		fixture.setWeight(weight);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
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
	 * @generatedBy CodePro at 5/19/15 11:28 PM
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
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WeaponTest.class);
	}
}