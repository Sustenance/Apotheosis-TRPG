package fer.ai;

import java.util.ArrayList;
import org.junit.*;
import fer.Map;
import fer.util.MapData;
import fer.Unit;
import fer.Tile;
import fer.util.UnitData;
import static org.junit.Assert.*;

/**
 * The class <code>PathFinderTest</code> contains tests for the class <code>{@link PathFinder}</code>.
 *
 * @generatedBy CodePro at 5/18/15 4:22 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class PathFinderTest {
	/**
	 * Run the PathFinder() constructor test.
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testPathFinder_1()
		throws Exception {
		PathFinder result = new PathFinder();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the ArrayList<Tile> getAttackableTiles(Unit,int,int,Map,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testGetAttackableTiles_1()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		Unit unit = new Unit(new UnitData());
		int x = 1;
		int y = 1;
		Map map = new Map(new MapData());
		int weapon = 1;

		ArrayList<Tile> result = fixture.getAttackableTiles(unit, x, y, map, weapon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Tile> getAttackableTiles(Unit,int,int,Map,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testGetAttackableTiles_2()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		Unit unit = new Unit(new UnitData());
		int x = 1;
		int y = 1;
		Map map = new Map(new MapData());
		int weapon = 1;

		ArrayList<Tile> result = fixture.getAttackableTiles(unit, x, y, map, weapon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Tile> getAttackableTiles(Unit,int,int,Map,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testGetAttackableTiles_3()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		Unit unit = new Unit(new UnitData());
		int x = 1;
		int y = 1;
		Map map = new Map(new MapData());
		int weapon = 1;

		ArrayList<Tile> result = fixture.getAttackableTiles(unit, x, y, map, weapon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Tile> getAttackableTiles(Unit,int,int,Map,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testGetAttackableTiles_4()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		Unit unit = new Unit(new UnitData());
		int x = 1;
		int y = 1;
		Map map = new Map(new MapData());
		int weapon = 1;

		ArrayList<Tile> result = fixture.getAttackableTiles(unit, x, y, map, weapon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Tile> getMovableTiles(Unit,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testGetMovableTiles_1()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		Unit unit = new Unit(new UnitData());
		unit.setMapx(1);
		unit.setMapy(1);
		unit.setMov(1);
		Map map = new Map(new MapData());

		ArrayList<Tile> result = fixture.getMovableTiles(unit, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Tile> getMovableTiles(Unit,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testGetMovableTiles_2()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		Unit unit = new Unit(new UnitData());
		unit.setMapx(1);
		unit.setMapy(1);
		unit.setMov(1);
		Map map = new Map(new MapData());

		ArrayList<Tile> result = fixture.getMovableTiles(unit, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Tile> getMovableTiles(Unit,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testGetMovableTiles_3()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		Unit unit = new Unit(new UnitData());
		unit.setMapx(1);
		unit.setMapy(1);
		unit.setMov(1);
		Map map = new Map(new MapData());

		ArrayList<Tile> result = fixture.getMovableTiles(unit, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Tile> getMovableTiles(Unit,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testGetMovableTiles_4()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		Unit unit = new Unit(new UnitData());
		unit.setMapx(1);
		unit.setMapy(1);
		Map map = new Map(new MapData());

		ArrayList<Tile> result = fixture.getMovableTiles(unit, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getUnitClassData(Game.java:411)
		//       at fer.UnitClass.<init>(UnitClass.java:54)
		//       at fer.Unit.<init>(Unit.java:152)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Tile> getShortestPathAStar(Map,Unit,Tile,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testGetShortestPathAStar_1()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		Map map = new Map(new MapData());
		Unit unit = new Unit(new UnitData());
		Tile start = new Tile(1);
		Tile target = new Tile(1);

		ArrayList<Tile> result = fixture.getShortestPathAStar(map, unit, start, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Map.<init>(Map.java:101)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Tile> getShortestPathAStar(Map,Unit,Tile,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testGetShortestPathAStar_2()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		Map map = new Map(new MapData());
		Unit unit = new Unit(new UnitData());
		Tile start = new Tile(1);
		Tile target = new Tile(1);

		ArrayList<Tile> result = fixture.getShortestPathAStar(map, unit, start, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Map.<init>(Map.java:101)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Tile> getShortestPathAStar(Map,Unit,Tile,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testGetShortestPathAStar_3()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		Map map = new Map(new MapData());
		Unit unit = new Unit(new UnitData());
		Tile start = new Tile(1);
		Tile target = new Tile(1);

		ArrayList<Tile> result = fixture.getShortestPathAStar(map, unit, start, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Map.<init>(Map.java:101)
		assertNotNull(result);
	}

	/**
	 * Run the void setExcludeCollision(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testSetExcludeCollision_1()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		int x = 1;
		int y = 1;

		fixture.setExcludeCollision(x, y);

		// add additional test code here
	}

	/**
	 * Run the void setUnitCollision(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	@Test
	public void testSetUnitCollision_1()
		throws Exception {
		PathFinder fixture = new PathFinder();
		fixture.setUnitCollision(true);
		boolean unitCollision = true;

		fixture.setUnitCollision(unitCollision);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/15 4:22 PM
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
	 * @generatedBy CodePro at 5/18/15 4:22 PM
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
	 * @generatedBy CodePro at 5/18/15 4:22 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PathFinderTest.class);
	}
}