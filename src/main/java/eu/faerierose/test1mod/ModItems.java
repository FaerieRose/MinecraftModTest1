package eu.faerierose.test1mod;

import eu.faerierose.test1mod.help.RegisterHelper;
import eu.faerierose.test1mod.items.Test1ModItem;

import net.minecraft.item.Item;

public class ModItems {
	public static Item test1Item = new Test1ModItem("faerie_rose_test1Item");
	
	public static void init() {
		RegisterHelper.registerItem(test1Item);
	}

}
