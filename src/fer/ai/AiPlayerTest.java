package fer.ai;

import java.util.ArrayList;
import org.junit.*;
import fer.Unit;
import fer.UnitClass;
import fer.Tile;
import fer.gameplay.Weapon;
import fer.util.UnitData;
import static org.junit.Assert.*;

/**
 * The class <code>AiPlayerTest</code> contains tests for the class <code>{@link AiPlayer}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:21 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class AiPlayerTest {
	/**
	 * Run the AiPlayer(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAiPlayer_1()
		throws Exception {
		int faction = 1;

		AiPlayer result = new AiPlayer(faction);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isTakingTurn());
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_3()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_4()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_5()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_6()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_7()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_8()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_9()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_10()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_11()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_12()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_13()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_14()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList<AiTask> tasks = new ArrayList();

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_15()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the void assignTasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAssignTasks_16()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList<AiTask> tasks = new ArrayList();

		fixture.assignTasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineUnits(AiPlayer.java:371)
		//       at fer.ai.AiPlayer.assignTasks(AiPlayer.java:313)
	}

	/**
	 * Run the int attackerCanTraverse(Unit,ArrayList<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAttackerCanTraverse_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitClass(1), 1, 1);
		ArrayList<Tile> path = new ArrayList();

		int result = fixture.attackerCanTraverse(attacker, path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the int attackerCanTraverse(Unit,ArrayList<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testAttackerCanTraverse_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitData());
		ArrayList<Tile> path = new ArrayList();

		int result = fixture.attackerCanTraverse(attacker, path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean canAttack(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testCanAttack_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitData());
		Unit defender = new Unit(new UnitData());

		boolean result = fixture.canAttack(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertTrue(result);
	}

	/**
	 * Run the boolean canAttack(Unit,Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testCanAttack_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitData());
		Unit defender = new Unit(new UnitData());

		boolean result = fixture.canAttack(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertTrue(result);
	}

	/**
	 * Run the int determineAverageX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testDetermineAverageX_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		int faction = 1;

		int result = fixture.determineAverageX(faction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineAverageX(AiPlayer.java:424)
		assertEquals(0, result);
	}

	/**
	 * Run the int determineAverageX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testDetermineAverageX_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		int faction = 1;

		int result = fixture.determineAverageX(faction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineAverageX(AiPlayer.java:424)
		assertEquals(0, result);
	}

	/**
	 * Run the int determineAverageX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testDetermineAverageX_3()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		int faction = 1;

		int result = fixture.determineAverageX(faction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineAverageX(AiPlayer.java:424)
		assertEquals(0, result);
	}

	/**
	 * Run the int determineAverageY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testDetermineAverageY_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		int faction = 1;

		int result = fixture.determineAverageY(faction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineAverageY(AiPlayer.java:436)
		assertEquals(0, result);
	}

	/**
	 * Run the int determineAverageY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testDetermineAverageY_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		int faction = 1;

		int result = fixture.determineAverageY(faction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineAverageY(AiPlayer.java:436)
		assertEquals(0, result);
	}

	/**
	 * Run the int determineAverageY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testDetermineAverageY_3()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		int faction = 1;

		int result = fixture.determineAverageY(faction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.determineAverageY(AiPlayer.java:436)
		assertEquals(0, result);
	}

	/**
	 * Run the void endTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testEndTurn_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.endTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.endTurn(AiPlayer.java:203)
	}

	/**
	 * Run the int findLongestRange(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testFindLongestRange_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitData());

		int result = fixture.findLongestRange(attacker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertEquals(0, result);
	}

	/**
	 * Run the ArrayList<AiTask> generateAITasks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testGenerateAITasks_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		ArrayList<AiTask> result = fixture.generateAITasks();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<AiTask> generateAITasks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testGenerateAITasks_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		ArrayList<AiTask> result = fixture.generateAITasks();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<AiTask> generateAITasks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testGenerateAITasks_3()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		ArrayList<AiTask> result = fixture.generateAITasks();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<AiTask> generateAITasks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testGenerateAITasks_4()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		ArrayList<AiTask> result = fixture.generateAITasks();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Unit> getAttackableUnits(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testGetAttackableUnits_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitData());
		attacker.setWeapons(new Weapon[] {});

		ArrayList<Unit> result = fixture.getAttackableUnits(attacker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Unit> getAttackableUnits(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testGetAttackableUnits_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitData());
		attacker.setWeapons(new Weapon[] {});

		ArrayList<Unit> result = fixture.getAttackableUnits(attacker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Unit> getAttackableUnits(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testGetAttackableUnits_3()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitData());
		attacker.setWeapons(new Weapon[] {});

		ArrayList<Unit> result = fixture.getAttackableUnits(attacker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Unit> getAttackableUnits(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testGetAttackableUnits_4()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitData());
		attacker.setWeapons(new Weapon[] {});

		ArrayList<Unit> result = fixture.getAttackableUnits(attacker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Unit> getAttackableUnits(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testGetAttackableUnits_5()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		Unit attacker = new Unit(new UnitData());
		attacker.setWeapons(new Weapon[] {});

		ArrayList<Unit> result = fixture.getAttackableUnits(attacker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isTakingTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testIsTakingTurn_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		boolean result = fixture.isTakingTurn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTakingTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testIsTakingTurn_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		boolean result = fixture.isTakingTurn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void prioritizeAITasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testPrioritizeAITasks_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList tasks = new ArrayList();
		tasks.add(AiTaskFactory.createAiTask());

		fixture.prioritizeAITasks(tasks);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.addPriority(AiPlayer.java:239)
		//       at fer.ai.AiPlayer.prioritizeAITasks(AiPlayer.java:230)
	}

	/**
	 * Run the void prioritizeAITasks(ArrayList<AiTask>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testPrioritizeAITasks_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList<AiTask> tasks = new ArrayList();

		fixture.prioritizeAITasks(tasks);

		// add additional test code here
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_3()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_4()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_5()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_6()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_7()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_8()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_9()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_10()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_11()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_12()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_13()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_14()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_15()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testRun_16()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.run(AiPlayer.java:530)
	}

	/**
	 * Run the boolean shortestPathGreater(ArrayList<Tile>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testShortestPathGreater_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList<Tile> shortestPath = new ArrayList();
		int range = 1;

		boolean result = fixture.shortestPathGreater(shortestPath, range);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean shortestPathGreater(ArrayList<Tile>,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testShortestPathGreater_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();
		ArrayList<Tile> shortestPath = new ArrayList();
		int range = 1;

		boolean result = fixture.shortestPathGreater(shortestPath, range);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void startTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testStartTurn_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.startTurn();

		// add additional test code here
	}

	/**
	 * Run the void takeTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testTakeTurn_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.takeTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.takeTurn(AiPlayer.java:382)
	}

	/**
	 * Run the void takeTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testTakeTurn_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.takeTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.takeTurn(AiPlayer.java:382)
	}

	/**
	 * Run the void takeTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testTakeTurn_3()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.takeTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.takeTurn(AiPlayer.java:382)
	}

	/**
	 * Run the void takeTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testTakeTurn_4()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.takeTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.takeTurn(AiPlayer.java:382)
	}

	/**
	 * Run the void takeTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testTakeTurn_5()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.takeTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.takeTurn(AiPlayer.java:382)
	}

	/**
	 * Run the void takeTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testTakeTurn_6()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.takeTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ai.AiPlayer.generateAITasks(AiPlayer.java:210)
		//       at fer.ai.AiPlayer.takeTurn(AiPlayer.java:382)
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_3()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_4()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_5()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_6()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_7()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_8()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_9()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_10()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_11()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_12()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_13()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_14()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_15()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	@Test
	public void testUpdate_16()
		throws Exception {
		AiPlayer fixture = new AiPlayer(1);
		fixture.update();
		fixture.update();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/15 11:21 PM
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
	 * @generatedBy CodePro at 5/19/15 11:21 PM
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
	 * @generatedBy CodePro at 5/19/15 11:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AiPlayerTest.class);
	}
}