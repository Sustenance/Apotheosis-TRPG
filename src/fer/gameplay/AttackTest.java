package fer.gameplay;

import org.junit.*;
import fer.ai.PathFinder;
import fer.Unit;
import fer.util.UnitData;
import static org.junit.Assert.*;

/**
 * The class <code>AttackTest</code> contains tests for the class <code>{@link Attack}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:28 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class AttackTest {
	/**
	 * Run the void attackWithWeaponInRange(PathFinder,BattleProcessor,Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testAttackWithWeaponInRange_1()
		throws Exception {
		PathFinder pf = new PathFinder();
		BattleProcessor bp = new BattleProcessor();
		Unit unit = new Unit(new UnitData());
		unit.setMapy(1);
		unit.setWeapons(new Weapon[] {});
		unit.setMapx(1);
		Unit target = new Unit(new UnitData());
		target.setMapy(1);
		target.setMapx(1);

		Attack.attackWithWeaponInRange(pf, bp, unit, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void attackWithWeaponInRange(PathFinder,BattleProcessor,Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testAttackWithWeaponInRange_2()
		throws Exception {
		PathFinder pf = new PathFinder();
		BattleProcessor bp = new BattleProcessor();
		Unit unit = new Unit(new UnitData());
		unit.setWeapons(new Weapon[] {});
		Unit target = new Unit(new UnitData());

		Attack.attackWithWeaponInRange(pf, bp, unit, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void attackWithWeaponInRange(PathFinder,BattleProcessor,Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testAttackWithWeaponInRange_3()
		throws Exception {
		PathFinder pf = new PathFinder();
		BattleProcessor bp = new BattleProcessor();
		Unit unit = new Unit(new UnitData());
		unit.setWeapons(new Weapon[] {});
		Unit target = new Unit(new UnitData());

		Attack.attackWithWeaponInRange(pf, bp, unit, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void attackWithWeaponInRange(PathFinder,BattleProcessor,Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testAttackWithWeaponInRange_4()
		throws Exception {
		PathFinder pf = new PathFinder();
		BattleProcessor bp = new BattleProcessor();
		Unit unit = new Unit(new UnitData());
		unit.setMapy(1);
		unit.setWeapons(new Weapon[] {});
		unit.setMapx(1);
		Unit target = new Unit(new UnitData());
		target.setMapy(1);
		target.setMapx(1);

		Attack.attackWithWeaponInRange(pf, bp, unit, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the void attackWithWeaponInRange(PathFinder,BattleProcessor,Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testAttackWithWeaponInRange_5()
		throws Exception {
		PathFinder pf = new PathFinder();
		BattleProcessor bp = new BattleProcessor();
		Unit unit = new Unit(new UnitData());
		unit.setMapy(1);
		unit.setWeapons(new Weapon[] {});
		unit.setMapx(1);
		Unit target = new Unit(new UnitData());
		target.setMapy(1);
		target.setMapx(1);

		Attack.attackWithWeaponInRange(pf, bp, unit, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
	}

	/**
	 * Run the int calculateAttackDamage(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateAttackDamage_1()
		throws Exception {
		Unit attacker = new Unit(new UnitData());
		attacker.setStr(1);
		Unit defender = new Unit(new UnitData());
		defender.setDef(1);
		defender.setMapy(1);
		defender.setMapx(1);
		defender.setArmor(new Armor(1));

		int result = Attack.calculateAttackDamage(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the float calculateAttackHitChance(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateAttackHitChance_1()
		throws Exception {
		Unit attacker = new Unit(new UnitData());
		attacker.setSkl(1);
		Unit defender = new Unit(new UnitData());
		defender.setMapy(1);
		defender.setMapx(1);

		float result = Attack.calculateAttackHitChance(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the int calculateAttackSpeed(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateAttackSpeed_1()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setSpd(1);
		unit.setCon(1);
		unit.setArmor(new Armor(1));

		int result = Attack.calculateAttackSpeed(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the int calculateAttackSpeed(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateAttackSpeed_2()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setSpd(1);
		unit.setCon(1);
		unit.setArmor(new Armor(1));

		int result = Attack.calculateAttackSpeed(unit);

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
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateDeathChance_1()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setCurrentHp(1);
		Unit opponent = new Unit(new UnitData());
		boolean unitAttacking = true;

		double result = Attack.calculateDeathChance(unit, opponent, unitAttacking);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double calculateDeathChance(Unit,Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateDeathChance_2()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setCurrentHp(1);
		Unit opponent = new Unit(new UnitData());
		opponent.setCurrentHp(1);
		boolean unitAttacking = true;

		double result = Attack.calculateDeathChance(unit, opponent, unitAttacking);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double calculateDeathChance(Unit,Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateDeathChance_3()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setCurrentHp(1);
		Unit opponent = new Unit(new UnitData());
		opponent.setCurrentHp(1);
		boolean unitAttacking = true;

		double result = Attack.calculateDeathChance(unit, opponent, unitAttacking);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double calculateDeathChance(Unit,Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateDeathChance_4()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setCurrentHp(1);
		Unit opponent = new Unit(new UnitData());
		opponent.setCurrentHp(1);
		boolean unitAttacking = true;

		double result = Attack.calculateDeathChance(unit, opponent, unitAttacking);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double calculateDeathChance(Unit,Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateDeathChance_5()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setCurrentHp(1);
		Unit opponent = new Unit(new UnitData());
		opponent.setCurrentHp(1);
		boolean unitAttacking = true;

		double result = Attack.calculateDeathChance(unit, opponent, unitAttacking);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double calculateDeathChance(Unit,Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateDeathChance_6()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setCurrentHp(1);
		Unit opponent = new Unit(new UnitData());
		opponent.setCurrentHp(1);
		boolean unitAttacking = false;

		double result = Attack.calculateDeathChance(unit, opponent, unitAttacking);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double calculateDeathChance(Unit,Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateDeathChance_7()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setCurrentHp(1);
		Unit opponent = new Unit(new UnitData());
		opponent.setCurrentHp(1);
		boolean unitAttacking = false;

		double result = Attack.calculateDeathChance(unit, opponent, unitAttacking);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double calculateDeathChance(Unit,Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateDeathChance_8()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setCurrentHp(1);
		Unit opponent = new Unit(new UnitData());
		opponent.setCurrentHp(1);
		boolean unitAttacking = true;

		double result = Attack.calculateDeathChance(unit, opponent, unitAttacking);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double calculateDeathChance(Unit,Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateDeathChance_9()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setCurrentHp(1);
		Unit opponent = new Unit(new UnitData());
		opponent.setCurrentHp(1);
		boolean unitAttacking = true;

		double result = Attack.calculateDeathChance(unit, opponent, unitAttacking);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double calculateDeathChance(Unit,Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testCalculateDeathChance_10()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setCurrentHp(1);
		Unit opponent = new Unit(new UnitData());
		opponent.setCurrentHp(1);
		boolean unitAttacking = false;

		double result = Attack.calculateDeathChance(unit, opponent, unitAttacking);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the int getAttackUnits(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetAttackUnits_1()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		Unit opponent = new Unit(new UnitData());

		int result = Attack.getAttackUnits(unit, opponent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAttackUnits(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetAttackUnits_2()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		Unit opponent = new Unit(new UnitData());

		int result = Attack.getAttackUnits(unit, opponent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the int getNumberOfAttacks(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetNumberOfAttacks_1()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setMapy(1);
		unit.setMapx(1);
		Unit opponent = new Unit(new UnitData());
		opponent.setMapy(1);
		opponent.setMapx(1);

		int result = Attack.getNumberOfAttacks(unit, opponent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the int getNumberOfAttacks(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:28 PM
	 */
	@Test
	public void testGetNumberOfAttacks_2()
		throws Exception {
		Unit unit = new Unit(new UnitData());
		unit.setMapy(1);
		unit.setMapx(1);
		Unit opponent = new Unit(new UnitData());
		opponent.setMapy(1);
		opponent.setMapx(1);

		int result = Attack.getNumberOfAttacks(unit, opponent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(AttackTest.class);
	}
}