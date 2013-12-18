package net.superguy9.machinecraft;

import net.superguy9.machinecraft.config.ConfigHandler;
import net.superguy9.machinecraft.creativetabs.MachineCraftTabs;
import net.superguy9.machinecraft.items.Items;
import net.superguy9.machinecraft.network.PacketHandler;
import net.superguy9.machinecraft.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class, channels = {ModInformation.CHANNEL})
public class MachineCraft {
	
	@Instance(value = ModInformation.ID)
	public static MachineCraft instance;
	
	@SidedProxy(clientSide = "net.superguy9.machinecraft.proxy.ClientProxy", serverSide = "net.superguy9.machinecraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static MachineCraftTabs creativeTabs = new MachineCraftTabs();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		Items.init();
		
		proxy.initRenderers();
		proxy.initSounds();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		MachineCraftTabs.addNames();
		Items.addNames();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
