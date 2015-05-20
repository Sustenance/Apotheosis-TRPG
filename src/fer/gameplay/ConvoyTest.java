package fer.gameplay;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConvoyTest</code> contains tests for the class <code>{@link Convoy}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:27 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class ConvoyTest {
	/**
	 * Run the Convoy() constructor test.
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testConvoy_1()
		throws Exception {
		Convoy result = new Convoy();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Armor getArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetArmor_1()
		throws Exception {
		Convoy fixture = new Convoy();
		fixture.setFunds(1);
		int index = 1;

		Armor result = fixture.getArmor(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at fer.gameplay.Convoy.getArmor(Convoy.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the int getFunds() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetFunds_1()
		throws Exception {
		Convoy fixture = new Convoy();
		fixture.setFunds(1);

		int result = fixture.getFunds();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Item getItem(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		Convoy fixture = new Convoy();
		fixture.setFunds(1);
		int index = 1;

		Item result = fixture.getItem(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at fer.gameplay.Convoy.getItem(Convoy.java:20)
		assertNotNull(result);
	}

	/**
	 * Run the Weapon getWeapon(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetWeapon_1()
		throws Exception {
		Convoy fixture = new Convoy();
		fixture.setFunds(1);
		int index = 1;

		Weapon result = fixture.getWeapon(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at fer.gameplay.Convoy.getWeapon(Convoy.java:34)
		assertNotNull(result);
	}

	/**
	 * Run the void setArmor(Armor,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetArmor_1()
		throws Exception {
		Convoy fixture = new Convoy();
		fixture.setFunds(1);
		Armor armor = new Armor(1);
		int index = 1;

		fixture.setArmor(armor, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getArmorData(Game.java:403)
		//       at fer.gameplay.Armor.<init>(Armor.java:26)
	}

	/**
	 * Run the void setFunds(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetFunds_1()
		throws Exception {
		Convoy fixture = new Convoy();
		fixture.setFunds(1);
		int funds = 1;

		fixture.setFunds(funds);

		// add additional test code here
	}

	/**
	 * Run the void setItem(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetItem_1()
		throws Exception {
		Convoy fixture = new Convoy();
		fixture.setFunds(1);
		Item item = new Item(1);
		int index = 1;

		fixture.setItem(item, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getItemData(Game.java:399)
		//       at fer.gameplay.Item.<init>(Item.java:46)
	}

	/**
	 * Run the void setWeapon(Weapon,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetWeapon_1()
		throws Exception {
		Convoy fixture = new Convoy();
		fixture.setFunds(1);
		Weapon weapon = new Weapon(1);
		int index = 1;

		fixture.setWeapon(weapon, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getWeaponData(Game.java:395)
		//       at fer.gameplay.Weapon.<init>(Weapon.java:36)
	}

	/**
	 * Run the void swapArmors(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSwapArmors_1()
		throws Exception {
		Convoy fixture = new Convoy();
		fixture.setFunds(1);
		int index1 = 1;
		int index2 = 1;

		fixture.swapArmors(index1, index2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at fer.gameplay.Convoy.swapArmors(Convoy.java:56)
	}

	/**
	 * Run the void swapItems(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSwapItems_1()
		throws Exception {
		Convoy fixture = new Convoy();
		fixture.setFunds(1);
		int index1 = 1;
		int index2 = 1;

		fixture.swapItems(index1, index2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at fer.gameplay.Convoy.swapItems(Convoy.java:28)
	}

	/**
	 * Run the void swapWeapons(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSwapWeapons_1()
		throws Exception {
		Convoy fixture = new Convoy();
		fixture.setFunds(1);
		int index1 = 1;
		int index2 = 1;

		fixture.swapWeapons(index1, index2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at fer.gameplay.Convoy.swapWeapons(Convoy.java:42)
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
		new org.junit.runner.JUnitCore().run(ConvoyTest.class);
	}
}