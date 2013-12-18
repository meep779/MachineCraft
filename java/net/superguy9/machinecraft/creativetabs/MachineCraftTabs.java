package net.superguy9.machinecraft.creativetabs;

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
}
