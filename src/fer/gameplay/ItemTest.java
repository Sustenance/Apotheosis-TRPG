package fer.gameplay;

import org.junit.*;
import fer.ui.MenuAction;
import fer.ui.Menu;
import fer.graphics.Sprite;
import static org.junit.Assert.*;

/**
 * The class <code>ItemTest</code> contains tests for the class <code>{@link Item}</code>.
 *
 * @generatedBy CodePro at 5/19/15 11:32 PM
 * @author gjste_000
 * @version $Revision: 1.0 $
 */
public class ItemTest {
	/**
	 * Run the Item(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testItem_1()
		throws Exception {
		int typeindex = 1;

		Item result = new Item(typeindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getItemData(Game.java:399)
		//       at fer.gameplay.Item.<init>(Item.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the Item(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testItem_2()
		throws Exception {
		int typeindex = 1;

		Item result = new Item(typeindex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.Game.getItemData(Game.java:399)
		//       at fer.gameplay.Item.<init>(Item.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the Item(String,Sprite,MenuAction) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testItem_3()
		throws Exception {
		String iName = "";
		Sprite iIcon = new Sprite(1, 1, 1, 1);
		MenuAction iAction = null;

		Item result = new Item(iName, iIcon, iAction);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDescription());
		assertEquals(0, result.getUses());
		assertEquals(0, result.getMaxUses());
		assertEquals(null, result.getUsedAction());
		assertEquals(false, result.isConsumable());
		assertEquals(false, result.infoMenuDrawn());
	}

	/**
	 * Run the void clearInfoMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testClearInfoMenu_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);

		fixture.clearInfoMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.gameplay.Item.clearInfoMenu(Item.java:173)
	}

	/**
	 * Run the void drawInfoMenu(int,int,Menu,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testDrawInfoMenu_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);
		int x = 1;
		int y = 1;
		Menu callingMenu = new Menu(1, 1, 1, 1);
		boolean active = true;

		fixture.drawInfoMenu(x, y, callingMenu, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void drawInfoMenu(int,int,Menu,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testDrawInfoMenu_2()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);
		int x = 1;
		int y = 1;
		Menu callingMenu = new Menu(1, 1, 1, 1);
		boolean active = true;

		fixture.drawInfoMenu(x, y, callingMenu, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void drawInfoMenu(int,int,Menu,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testDrawInfoMenu_3()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);
		int x = 1;
		int y = 1;
		Menu callingMenu = new Menu(1, 1, 1, 1);
		boolean active = false;

		fixture.drawInfoMenu(x, y, callingMenu, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the void drawInfoMenu(int,int,Menu,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testDrawInfoMenu_4()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);
		int x = 1;
		int y = 1;
		Menu callingMenu = new Menu(1, 1, 1, 1);
		boolean active = false;

		fixture.drawInfoMenu(x, y, callingMenu, active);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at fer.ui.Menu.<init>(Menu.java:57)
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Sprite getIcon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testGetIcon_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);

		Sprite result = fixture.getIcon();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getHeight());
		assertEquals(1, result.getWidth());
		assertEquals(1, result.getTransparentColor());
	}

	/**
	 * Run the int getMaxUses() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testGetMaxUses_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);

		int result = fixture.getMaxUses();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the MenuAction getUsedAction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testGetUsedAction_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);

		MenuAction result = fixture.getUsedAction();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getUses() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testGetUses_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);

		int result = fixture.getUses();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean infoMenuDrawn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testInfoMenuDrawn_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);

		boolean result = fixture.infoMenuDrawn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean infoMenuDrawn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testInfoMenuDrawn_2()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);

		boolean result = fixture.infoMenuDrawn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isConsumable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testIsConsumable_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);

		boolean result = fixture.isConsumable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isConsumable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testIsConsumable_2()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(false);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);

		boolean result = fixture.isConsumable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setConsumable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testSetConsumable_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);
		boolean consumable = true;

		fixture.setConsumable(consumable);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setIcon(Sprite) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testSetIcon_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);
		Sprite icon = new Sprite(1, 1, 1, 1);

		fixture.setIcon(icon);

		// add additional test code here
	}

	/**
	 * Run the void setMaxUses(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testSetMaxUses_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);
		int maxUses = 1;

		fixture.setMaxUses(maxUses);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setUsedAction(MenuAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testSetUsedAction_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);
		MenuAction used = null;

		fixture.setUsedAction(used);

		// add additional test code here
	}

	/**
	 * Run the void setUses(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/15 11:32 PM
	 */
	@Test
	public void testSetUses_1()
		throws Exception {
		Item fixture = new Item("", new Sprite(1, 1, 1, 1), (MenuAction) null);
		fixture.setConsumable(true);
		fixture.setDescription("");
		fixture.setMaxUses(1);
		fixture.setUses(1);
		int uses = 1;

		fixture.setUses(uses);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(ItemTest.class);
	}
}