package fer.gameplay;

import org.junit.*;
import fer.Map;
import fer.util.GoalData;
import fer.util.MapData;
import fer.Unit;
import static org.junit.Assert.*;

/**
 * The class <code>MapGoalTest</code> contains tests for the class <code>{@link MapGoal}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:27 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class MapGoalTest {
	/**
	 * Run the MapGoal(GoalData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testMapGoal_1()
		throws Exception {
		GoalData data = new GoalData();
		data.setMapx(1);
		data.setType("REACH TILE");
		data.setMapy(1);
		data.setIndex(1);

		MapGoal result = new MapGoal(data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTargets());
		assertEquals(1, result.getFaction());
		assertEquals(0, result.getTurns());
		assertEquals(1, result.getTileX());
		assertEquals(1, result.getTileY());
	}

	/**
	 * Run the MapGoal(GoalData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testMapGoal_2()
		throws Exception {
		GoalData data = new GoalData();
		data.setType("KILL TARGET");
		data.setTargets(new int[] {});
		data.setIndex(1);

		MapGoal result = new MapGoal(data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getFaction());
		assertEquals(0, result.getTurns());
		assertEquals(0, result.getTileX());
		assertEquals(0, result.getTileY());
	}

	/**
	 * Run the MapGoal(GoalData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testMapGoal_3()
		throws Exception {
		GoalData data = new GoalData();
		data.setType("DEFEND TARGET");
		data.setTargets(new int[] {});
		data.setTurns(1);
		data.setIndex(1);

		MapGoal result = new MapGoal(data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getFaction());
		assertEquals(1, result.getTurns());
		assertEquals(0, result.getTileX());
		assertEquals(0, result.getTileY());
	}

	/**
	 * Run the MapGoal(GoalData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testMapGoal_4()
		throws Exception {
		GoalData data = new GoalData();
		data.setType("");
		data.setIndex(1);

		MapGoal result = new MapGoal(data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTargets());
		assertEquals(1, result.getFaction());
		assertEquals(0, result.getTurns());
		assertEquals(0, result.getTileX());
		assertEquals(0, result.getTileY());
	}

	/**
	 * Run the MapGoal(GoalType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testMapGoal_5()
		throws Exception {
		MapGoal.GoalType type = MapGoal.GoalType.DEFEND_TARGETS;
		int faction = 1;

		MapGoal result = new MapGoal(type, faction);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTargets());
		assertEquals(1, result.getFaction());
		assertEquals(0, result.getTurns());
		assertEquals(0, result.getTileX());
		assertEquals(0, result.getTileY());
	}

	/**
	 * Run the int getFaction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetFaction_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});

		int result = fixture.getFaction();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int[] getTargets() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetTargets_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});

		int[] result = fixture.getTargets();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int getTileX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetTileX_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});

		int result = fixture.getTileX();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTileY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetTileY_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});

		int result = fixture.getTileY();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTurns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetTurns_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});

		int result = fixture.getTurns();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the MapGoal.GoalType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});

		MapGoal.GoalType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("DEFEND TARGET", result.getName());
		assertEquals("DEFEND_TARGETS", result.name());
		assertEquals("DEFEND_TARGETS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the boolean isMet(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testIsMet_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		Map map = new Map(new MapData());

		boolean result = fixture.isMet(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Map.<init>(Map.java:101)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMet(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testIsMet_2()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		Map map = new Map(new MapData());

		boolean result = fixture.isMet(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Map.<init>(Map.java:101)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMet(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testIsMet_3()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		Map map = new Map(new MapData());

		boolean result = fixture.isMet(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Map.<init>(Map.java:101)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMet(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testIsMet_4()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		Map map = new Map(new MapData());

		boolean result = fixture.isMet(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Map.<init>(Map.java:101)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMet(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testIsMet_5()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		Map map = new Map(1, 1, "", new int[] {}, new Unit[] {}, new MapGoal[] {});

		boolean result = fixture.isMet(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getTileData(Game.java:407)
		//       at fer.Tile.<init>(Tile.java:35)
		//       at fer.Map.<init>(Map.java:69)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMet(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testIsMet_6()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		Map map = new Map(1, 1, "", new int[] {}, new Unit[] {}, new MapGoal[] {});

		boolean result = fixture.isMet(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getTileData(Game.java:407)
		//       at fer.Tile.<init>(Tile.java:35)
		//       at fer.Map.<init>(Map.java:69)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMet(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testIsMet_7()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		Map map = new Map(1, 1, "", new int[] {}, new Unit[] {}, new MapGoal[] {});

		boolean result = fixture.isMet(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getTileData(Game.java:407)
		//       at fer.Tile.<init>(Tile.java:35)
		//       at fer.Map.<init>(Map.java:69)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMet(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testIsMet_8()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		Map map = new Map(new MapData());

		boolean result = fixture.isMet(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Map.<init>(Map.java:101)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMet(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testIsMet_9()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		Map map = new Map(new MapData());

		boolean result = fixture.isMet(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Map.<init>(Map.java:101)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMet(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testIsMet_10()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		Map map = new Map(new MapData());

		boolean result = fixture.isMet(map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Map.<init>(Map.java:101)
		assertTrue(result);
	}

	/**
	 * Run the void setFaction(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetFaction_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		int faction = 1;

		fixture.setFaction(faction);

		// add additional test code here
	}

	/**
	 * Run the void setTargets(int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetTargets_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		int[] targets = new int[] {};

		fixture.setTargets(targets);

		// add additional test code here
	}

	/**
	 * Run the void setTileX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetTileX_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		int tileX = 1;

		fixture.setTileX(tileX);

		// add additional test code here
	}

	/**
	 * Run the void setTileY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetTileY_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		int tileY = 1;

		fixture.setTileY(tileY);

		// add additional test code here
	}

	/**
	 * Run the void setTurns(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetTurns_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		int turns = 1;

		fixture.setTurns(turns);

		// add additional test code here
	}

	/**
	 * Run the void setType(GoalType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:27 PM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		MapGoal fixture = new MapGoal(MapGoal.GoalType.DEFEND_TARGETS, 1);
		fixture.setTurns(1);
		fixture.setTileX(1);
		fixture.setTileY(1);
		fixture.setTargets(new int[] {});
		MapGoal.GoalType type = MapGoal.GoalType.DEFEND_TARGETS;

		fixture.setType(type);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(MapGoalTest.class);
	}
}