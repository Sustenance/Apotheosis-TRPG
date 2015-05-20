package fer.gameplay;

import org.junit.*;
import fer.Unit;
import fer.util.UnitData;
import static org.junit.Assert.*;

/**
 * The class <code>BattleProcessorTest</code> contains tests for the class <code>{@link BattleProcessor}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:32 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class BattleProcessorTest {
	/**
	 * Run the BattleProcessor() constructor test.
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testBattleProcessor_1()
		throws Exception {
		BattleProcessor result = new BattleProcessor();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int calculateAttackDamage(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testCalculateAttackDamage_1()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitData());
		Unit defender = new Unit(new UnitData());

		int result = fixture.calculateAttackDamage(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the double calculateDeathChance(Unit,Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testCalculateDeathChance_1()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit unit = new Unit(new UnitData());
		Unit opponent = new Unit(new UnitData());
		boolean unitAttacking = true;

		double result = fixture.calculateDeathChance(unit, opponent, unitAttacking);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_1()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_2()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_3()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_4()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_5()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_6()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_7()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_8()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_9()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_10()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_11()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_12()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_13()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_14()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_15()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void endBattle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testEndBattle_16()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.endBattle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the Unit getAttacker() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testGetAttacker_1()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		Unit result = fixture.getAttacker();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getDefender() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testGetDefender_1()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		Unit result = fixture.getDefender();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isInCombat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testIsInCombat_1()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		boolean result = fixture.isInCombat();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertTrue(result);
	}

	/**
	 * Run the boolean isInCombat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testIsInCombat_2()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		boolean result = fixture.isInCombat();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertTrue(result);
	}

	/**
	 * Run the void setAttacker(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testSetAttacker_1()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitData());

		fixture.setAttacker(attacker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void setDefender(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testSetDefender_1()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit defender = new Unit(new UnitData());

		fixture.setDefender(defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_1()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_2()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_3()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_4()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_5()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_6()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_7()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_8()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_9()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_10()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_11()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_12()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_13()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_14()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_15()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void startBattle(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testStartBattle_16()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();
		Unit iAttacker = new Unit(new UnitData());
		Unit iDefender = new Unit(new UnitData());

		fixture.startBattle(iAttacker, iDefender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_3()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_4()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_5()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_6()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_7()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_8()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_9()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_10()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_11()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_12()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_13()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_14()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testUpdate_15()
		throws Exception {
		BattleProcessor fixture = new BattleProcessor();
		fixture.setDefender(new Unit(new UnitData()));
		fixture.setAttacker(new Unit(new UnitData()));
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
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
	 * @generatedBy CodePro at 5/19/15 11:32 PM
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
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BattleProcessorTest.class);
	}
}