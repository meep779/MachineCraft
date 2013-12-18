package net.superguy9.machinecraft;

import net.superguy9.machinecraft.config.ConfigHandler;
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
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class, channels = {ModInformation.CHANNEL})
public class MachineCraft {
	
	@Instance(value = ModInformation.ID)
	public static MachineCraft instance;
	
	@SidedProxy(clientSide = "net.superguy9.machinecraft.proxy.ClientProxy", serverSide = "net.superguy9.machinecraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
		proxy.initRenderers();
		proxy.initSounds();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMachineCraftCore", "en_US", "MachineCraft Core");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMachineCraftBlocks", "en_US", "MachineCraft Blocks");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMachineCraftItems", "en_US", "MachineCraft Items");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMachineCraftPower", "en_US", "MachineCraft Power");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
