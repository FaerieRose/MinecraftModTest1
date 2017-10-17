package eu.faerierose.test1mod;

import eu.faerierose.test1mod.help.RegisterHelper;
import eu.faerierose.test1mod.items.Test1ModItem;

import net.minecraft.item.Item;

public class ModItems {
	public static Item test1Ingot = new Test1ModItem().setUnlocalizedName("test1Ingot");
	
	public static void init() {
		RegisterHelper.registerItem(test1Ingot);
	}

}
