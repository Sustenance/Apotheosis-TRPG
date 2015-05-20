package fer.gameplay;

import org.junit.*;
import fer.Unit;
import fer.util.UnitData;
import static org.junit.Assert.*;

/**
 * The class <code>DamageDealtTest</code> contains tests for the class <code>{@link DamageDealt}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:31 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class DamageDealtTest {
	/**
	 * Run the int getAttackerDamageDealt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:31 PM
	 */
	@Test
	public void testGetAttackerDamageDealt_1()
		throws Exception {
		DamageDealt fixture = new DamageDealt();
		fixture.setDefenderDamageDealt(1);
		fixture.setAttackerDamageDealt(1);

		int result = fixture.getAttackerDamageDealt();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDefenderDamageDealt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:31 PM
	 */
	@Test
	public void testGetDefenderDamageDealt_1()
		throws Exception {
		DamageDealt fixture = new DamageDealt();
		fixture.setDefenderDamageDealt(1);
		fixture.setAttackerDamageDealt(1);

		int result = fixture.getDefenderDamageDealt();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void initializeUnits(Unit,Unit,BattleProcessor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:31 PM
	 */
	@Test
	public void testInitializeUnits_1()
		throws Exception {
		DamageDealt fixture = new DamageDealt();
		fixture.setDefenderDamageDealt(1);
		fixture.setAttackerDamageDealt(1);
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());
		BattleProcessor battleProcessor = new BattleProcessor();
		battleProcessor.setAttacker(new Unit(new UnitData()));
		battleProcessor.setDefender(new Unit(new UnitData()));

		fixture.initializeUnits(iAttacker, iDefender, battleProcessor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void setAttackerDamageDealt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:31 PM
	 */
	@Test
	public void testSetAttackerDamageDealt_1()
		throws Exception {
		DamageDealt fixture = new DamageDealt();
		fixture.setDefenderDamageDealt(1);
		fixture.setAttackerDamageDealt(1);
		int attackerDamageDealt = 1;

		fixture.setAttackerDamageDealt(attackerDamageDealt);

		// add additional test code here
	}

	/**
	 * Run the void setDefenderDamageDealt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:31 PM
	 */
	@Test
	public void testSetDefenderDamageDealt_1()
		throws Exception {
		DamageDealt fixture = new DamageDealt();
		fixture.setDefenderDamageDealt(1);
		fixture.setAttackerDamageDealt(1);
		int defenderDamageDealt = 1;

		fixture.setDefenderDamageDealt(defenderDamageDealt);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/15 11:31 PM
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
	 * @generatedBy CodePro at 5/19/15 11:31 PM
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
	 * @generatedBy CodePro at 5/19/15 11:31 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DamageDealtTest.class);
	}
}