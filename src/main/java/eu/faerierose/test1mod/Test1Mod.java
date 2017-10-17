package eu.faerierose.test1mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import eu.faerierose.test1mod.help.Reference;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Test1Mod {
    @Instance
    public static Test1Mod instance = new Test1Mod();
        
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	System.out.println("Called method: preInit");
    	ModItems.init();
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	System.out.println("Called method: init");
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	System.out.println("Called method: postInit");
    }
}
