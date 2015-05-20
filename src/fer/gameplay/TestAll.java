package fer.gameplay;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/19/15 11:32 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	MapGoalTest.class,
	ItemTest.class,
	AttackMenusTest.class,
	BattleProcessorTest.class,
	ConvoyTest.class,
	DefenderMenusTest.class,
	ArmorTest.class,
	ExpMenusTest.class,
	AttackTest.class,
	WeaponTest.class,
	AttackerDefenderMenuTest.class,
	DamageDealtTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
