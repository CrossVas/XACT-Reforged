package xk.xact.util;

public class References {
	public static final String MOD_ID = "xact";
	public static final String MOD_NAME = "XACT Mod";
	public static final String VERSION = "@VERSION@";
	public static final String GUI_FACTORY_CLASS = "xk.xact.config.GuiFactory";
	
	public static class Registry {
		public static final String ITEMCHIPCASE = "chipCase";
		public static final String ITEMCRAFTPAD = "craftPad";
		public static final String ITEMRECIPEENCODED = "recipeEncoded";
		public static final String ITEMRECIPEBLANK = "recipeBlank";
	}

	public static class Unlocalized	 {
		public static final String PREFIX = MOD_ID + ":";
		public static final String ITEMCHIPCASE = PREFIX + Registry.ITEMCHIPCASE;
		public static final String ITEMCRAFTPAD = PREFIX + Registry.ITEMCRAFTPAD;
		public static final String ITEMRECIPEENCODED = PREFIX + Registry.ITEMRECIPEENCODED;
		public static final String ITEMRECIPEBLANK = PREFIX +  Registry.ITEMRECIPEBLANK;
	}
	
	public static class Keys {
		public static final String KEY_CATEGORY = "key.categories." + MOD_ID;
		public static final String KEY_CLEAR = MOD_ID + ".key.clear";
		public static final String KEY_LOAD = MOD_ID + ".key.load";
		public static final String KEY_PREV = MOD_ID + ".key.prev";
		public static final String KEY_NEXT = MOD_ID + ".key.next";
		public static final String KEY_DELETE = MOD_ID + ".key.delete";
		public static final String KEY_REVEAL = MOD_ID + ".key.reveal";
		public static final String KEY_OPENGRID = MOD_ID + ".key.opengrid";
	}
	
	public static class Localization {
		public static final String CRAFTPAD_GUITITLE = "gui.xact:craftpad.name";
		public static final String CRAFTPAD_CHIPTITLE = "gui.xact:craftpad.chip.name";
		public static final String CRAFTER_TITLE = "gui.xact:crafter.name";
		public static final String CRAFTER_INVENTORY = "gui.xact:crafter.inventory.name";
		public static final String CHIP_BLANK = "item.xact:recipeChip.blank.desc";
		public static final String CHIP_INVALID = "item.xact:recipeChip.invalid.desc";
		public static final String CHIP_RECIPE = "item.xact:recipeChip.recipe";
		public static final String PROMPT_TITLE = "gui.xact:prompt.name";
		
		public static final String TOOLTIP_CLEAR = "gui.xact:tipclear";
		public static final String TOOLTIP_SAVE = "gui.xact:tipsave";
		public static final String TOOLTIP_CLEARGRID = "gui.xact:tipcleargrid";
		public static final String TOOLTIP_NEXTRECIPE = "gui.xact:tipnextrecipe";
		public static final String TOOLTIP_LASTRECIPE = "gui.xact:tiplastrecipe";
		public static final String TOOLTIP_SETNAME = "gui.xact:tipsetname";
		public static final String TOOLTIP_ADJACENTCRAFTER = "gui.xact:tipadjacentcrafter";
		public static final String TOOLTIP_CLICKTOOPEN = "gui.xact:tipclicktoopengui";
		
		public static final String BUTTON_ACCEPT = "gui.xact:buttonAccept.name";
		public static final String BUTTON_CANCEL = "gui.xact:buttonCancel.name";
		
	}
}
