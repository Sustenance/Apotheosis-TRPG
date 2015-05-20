package fer.gameplay;

import org.junit.*;
import fer.graphics.Sprite;
import static org.junit.Assert.*;

/**
 * The class <code>ArmorTest</code> contains tests for the class <code>{@link Armor}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:27 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class ArmorTest {
	/**
	 * Run the Armor(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testArmor_1()
		throws Exception {
		int typeindex = 1;

		Armor result = new Armor(typeindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getArmorData(Game.java:403)
		//       at fer.gameplay.Armor.<init>(Armor.java:26)
		assertNotNull(result);
	}

	/**
	 * Run the int getEncumberance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetEncumberance_1()
		throws Exception {
		Armor fixture = new Armor(1);
		fixture.setName("");
		fixture.setEncumberance(1);
		fixture.setResilience(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));

		int result = fixture.getEncumberance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getArmorData(Game.java:403)
		//       at fer.gameplay.Armor.<init>(Armor.java:26)
		assertEquals(0, result);
	}

	/**
	 * Run the Sprite getIcon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetIcon_1()
		throws Exception {
		Armor fixture = new Armor(1);
		fixture.setName("");
		fixture.setEncumberance(1);
		fixture.setResilience(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));

		Sprite result = fixture.getIcon();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getArmorData(Game.java:403)
		//       at fer.gameplay.Armor.<init>(Armor.java:26)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Armor fixture = new Armor(1);
		fixture.setName("");
		fixture.setEncumberance(1);
		fixture.setResilience(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getArmorData(Game.java:403)
		//       at fer.gameplay.Armor.<init>(Armor.java:26)
		assertNotNull(result);
	}

	/**
	 * Run the int getResilience() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetResilience_1()
		throws Exception {
		Armor fixture = new Armor(1);
		fixture.setName("");
		fixture.setEncumberance(1);
		fixture.setResilience(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));

		int result = fixture.getResilience();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getArmorData(Game.java:403)
		//       at fer.gameplay.Armor.<init>(Armor.java:26)
		assertEquals(0, result);
	}

	/**
	 * Run the void setEncumberance(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetEncumberance_1()
		throws Exception {
		Armor fixture = new Armor(1);
		fixture.setName("");
		fixture.setEncumberance(1);
		fixture.setResilience(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		int encumberance = 1;

		fixture.setEncumberance(encumberance);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getArmorData(Game.java:403)
		//       at fer.gameplay.Armor.<init>(Armor.java:26)
	}

	/**
	 * Run the void setIcon(Sprite) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetIcon_1()
		throws Exception {
		Armor fixture = new Armor(1);
		fixture.setName("");
		fixture.setEncumberance(1);
		fixture.setResilience(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		Sprite icon = new Sprite(1, 1, 1, 1);

		fixture.setIcon(icon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getArmorData(Game.java:403)
		//       at fer.gameplay.Armor.<init>(Armor.java:26)
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Armor fixture = new Armor(1);
		fixture.setName("");
		fixture.setEncumberance(1);
		fixture.setResilience(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		String name = "";

		fixture.setName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getArmorData(Game.java:403)
		//       at fer.gameplay.Armor.<init>(Armor.java:26)
	}

	/**
	 * Run the void setResilience(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetResilience_1()
		throws Exception {
		Armor fixture = new Armor(1);
		fixture.setName("");
		fixture.setEncumberance(1);
		fixture.setResilience(1);
		fixture.setIcon(new Sprite(1, 1, 1, 1));
		int resilience = 1;

		fixture.setResilience(resilience);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getArmorData(Game.java:403)
		//       at fer.gameplay.Armor.<init>(Armor.java:26)
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
		new org.junit.runner.JUnitCore().run(ArmorTest.class);
	}
}