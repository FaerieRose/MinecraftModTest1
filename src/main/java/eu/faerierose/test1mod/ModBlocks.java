package eu.faerierose.test1mod;

import eu.faerierose.test1mod.blocks.Test1ModBlock;
import eu.faerierose.test1mod.help.RegisterHelper;
import eu.faerierose.test1mod.items.Test1ModItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {
	public static Block test1Ingot = new Test1ModBlock("test1Block", Material.iron);
	
	public static void init() {
		RegisterHelper.registerBlock(test1Ingot);
	}

}
