package net.superguy9.machinecraft.items;

import net.minecraft.item.Item;
import net.superguy9.machinecraft.creativetabs.MachineCraftTabs;

public class ItemWrench extends Item {
	
	public ItemWrench(int id){
		super(id);
		setMaxStackSize(1);
		setCreativeTab(MachineCraftTabs.tabMachineCraftItems);
	}
}
