package net.superguy9.machinecraft.creativetabs;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MachineCraftTabs {

	public static CreativeTabs tabMachineCraftCore = new CreativeTabs("tabMachineCraftCore") {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(Block.dirt, 1, 0);
		}
	};
	
	public static CreativeTabs tabMachineCraftBlocks = new CreativeTabs("tabMachineCraftBlocks") {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(Block.dirt, 1, 0);
		}
	};
	
	public static CreativeTabs tabMachineCraftItems = new CreativeTabs("tabMachineCraftItems") {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(Block.dirt, 1, 0);
		}
	};
	
	public static CreativeTabs tabMachineCraftPower = new CreativeTabs("tabMachineCraftPower") {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(Block.dirt, 1, 0);
		}
	};
	
	public static void addNames() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMachineCraftCore", "en_US", "MachineCraft Core");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMachineCraftBlocks", "en_US", "MachineCraft Blocks");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMachineCraftItems", "en_US", "MachineCraft Items");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMachineCraftPower", "en_US", "MachineCraft Power");
	}
}
