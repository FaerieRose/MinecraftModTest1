package eu.faerierose.test1mod.items;

import eu.faerierose.test1mod.help.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Test1ModItem extends Item {

	public Test1ModItem(String unlocalizedName) {
		super();
		setCreativeTab(CreativeTabs.tabMisc);
        this.setTextureName(Reference.MODID + ":" + unlocalizedName);
        this.setUnlocalizedName(unlocalizedName);
	}
}
