package fer.ai;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fer.Unit;
import fer.util.UnitData;

/**
 * The class <code>AiTaskTest</code> contains tests for the class <code>{@link AiTask}</code>.
 *
 * @generatedBy CodePro at 5/18/15 4:21 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class AiTaskTest {
	/**
	 * Run the AiTask(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testAiTask_1()
		throws Exception {
		int targetIndex = 1;

		AiTask result = new AiTask(targetIndex);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getPriority());
		assertEquals(0, result.getMapy());
		assertEquals(0, result.getMapx());
		assertEquals(-1, result.getAssignedIndex());
		assertEquals(1, result.getTargetIndex());
	}

	/**
	 * Run the AiTask(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testAiTask_2()
		throws Exception {
		int mapx = 1;
		int mapy = 1;

		AiTask result = new AiTask(mapx, mapy);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getPriority());
		assertEquals(1, result.getMapy());
		assertEquals(1, result.getMapx());
		assertEquals(-1, result.getAssignedIndex());
		assertEquals(-1, result.getTargetIndex());
	}

	/**
	 * Run the int determineUnitSuitability(Unit,boolean,double,double,AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testDetermineUnitSuitability_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		Unit unit = new Unit(new UnitData());
		unit.setMapy(1);
		unit.setMapx(1);
		boolean secondRun = true;
		double tolerableDamageRatio = 1.0;
		double tolerableDeathChance = 1.0;
		AiPlayer aIPlayer = new AiPlayer(1);

		int result = fixture.determineUnitSuitability(unit, secondRun, tolerableDamageRatio, tolerableDeathChance, aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the int determineUnitSuitability(Unit,boolean,double,double,AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testDetermineUnitSuitability_2()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		Unit unit = new Unit(new UnitData());
		boolean secondRun = true;
		double tolerableDamageRatio = 1.0;
		double tolerableDeathChance = 1.0;
		AiPlayer aIPlayer = new AiPlayer(1);

		int result = fixture.determineUnitSuitability(unit, secondRun, tolerableDamageRatio, tolerableDeathChance, aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the int determineUnitSuitability(Unit,boolean,double,double,AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testDetermineUnitSuitability_3()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		Unit unit = new Unit(new UnitData());
		unit.setMapy(1);
		unit.setMapx(1);
		boolean secondRun = false;
		double tolerableDamageRatio = 3.4028234663852886E38;
		double tolerableDeathChance = 1.0;
		AiPlayer aIPlayer = new AiPlayer(1);

		int result = fixture.determineUnitSuitability(unit, secondRun, tolerableDamageRatio, tolerableDeathChance, aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the int determineUnitSuitability(Unit,boolean,double,double,AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testDetermineUnitSuitability_4()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		Unit unit = new Unit(new UnitData());
		unit.setMapy(1);
		unit.setMapx(1);
		boolean secondRun = true;
		double tolerableDamageRatio = 1.0;
		double tolerableDeathChance = 1.0;
		AiPlayer aIPlayer = new AiPlayer(1);

		int result = fixture.determineUnitSuitability(unit, secondRun, tolerableDamageRatio, tolerableDeathChance, aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the int determineUnitSuitability(Unit,boolean,double,double,AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testDetermineUnitSuitability_5()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		Unit unit = new Unit(new UnitData());
		unit.setMapy(1);
		unit.setMapx(1);
		boolean secondRun = true;
		double tolerableDamageRatio = 1.0;
		double tolerableDeathChance = Double.POSITIVE_INFINITY;
		AiPlayer aIPlayer = new AiPlayer(1);

		int result = fixture.determineUnitSuitability(unit, secondRun, tolerableDamageRatio, tolerableDeathChance, aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the int determineUnitSuitability(Unit,boolean,double,double,AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testDetermineUnitSuitability_6()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		Unit unit = new Unit(new UnitData());
		unit.setMapy(1);
		unit.setMapx(1);
		boolean secondRun = true;
		double tolerableDamageRatio = 1.0;
		double tolerableDeathChance = 1.0;
		AiPlayer aIPlayer = new AiPlayer(1);

		int result = fixture.determineUnitSuitability(unit, secondRun, tolerableDamageRatio, tolerableDeathChance, aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAssignedIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testGetAssignedIndex_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);

		int result = fixture.getAssignedIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMapx() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testGetMapx_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);

		int result = fixture.getMapx();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMapy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testGetMapy_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);

		int result = fixture.getMapy();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getPriority() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testGetPriority_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);

		int result = fixture.getPriority();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTargetIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testGetTargetIndex_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);

		int result = fixture.getTargetIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the AiTask.TaskType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);

		AiTask.TaskType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ATTACK_UNIT", result.name());
		assertEquals("ATTACK_UNIT", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_2()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_3()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_4()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_5()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_6()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_7()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_8()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_9()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_10()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_11()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_12()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_13()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_14()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_15()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void moveUnit(AiPlayer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testMoveUnit_16()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiPlayer aIPlayer = new AiPlayer(1);

		fixture.moveUnit(aIPlayer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiTask.moveUnit(AiTask.java:165)
	}

	/**
	 * Run the void setAssignedIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testSetAssignedIndex_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		int assignedIndex = 1;

		fixture.setAssignedIndex(assignedIndex);

		// add additional test code here
	}

	/**
	 * Run the void setMapx(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testSetMapx_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		int mapx = 1;

		fixture.setMapx(mapx);

		// add additional test code here
	}

	/**
	 * Run the void setMapy(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testSetMapy_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		int mapy = 1;

		fixture.setMapy(mapy);

		// add additional test code here
	}

	/**
	 * Run the void setPriority(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testSetPriority_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		int priority = 1;

		fixture.setPriority(priority);

		// add additional test code here
	}

	/**
	 * Run the void setTargetIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testSetTargetIndex_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		int targetIndex = 1;

		fixture.setTargetIndex(targetIndex);

		// add additional test code here
	}

	/**
	 * Run the void setType(TaskType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		AiTask fixture = new AiTask(1, 1);
		fixture.setType(AiTask.TaskType.ATTACK_UNIT);
		fixture.setTargetIndex(1);
		fixture.setPriority(1);
		fixture.setAssignedIndex(1);
		AiTask.TaskType type = AiTask.TaskType.ATTACK_UNIT;

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/15 4:21 PM
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
	 * @generatedBy CodePro at 5/18/15 4:21 PM
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
	 * @generatedBy CodePro at 5/18/15 4:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AiTaskTest.class);
	}
}