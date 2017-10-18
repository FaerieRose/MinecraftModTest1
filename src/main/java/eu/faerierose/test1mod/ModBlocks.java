package eu.faerierose.test1mod;

import eu.faerierose.test1mod.blocks.Test1ModBlock;
import eu.faerierose.test1mod.help.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static Block test1Block = new Test1ModBlock("faerie_rose_test1Block", Material.iron);
	public static Block test2Block = new Test1ModBlock("faerie_rose_test2Block", Material.cloth);
	
	public static void init() {
		RegisterHelper.registerBlock(test1Block);
		RegisterHelper.registerBlock(test2Block);
	}

}
