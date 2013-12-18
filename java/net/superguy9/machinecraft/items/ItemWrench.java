package net.superguy9.machinecraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.superguy9.machinecraft.creativetabs.MachineCraftTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWrench extends Item {
	
	public ItemWrench(int id){
		super(id);
		setMaxStackSize(1);
		setCreativeTab(MachineCraftTabs.tabMachineCraftItems);
		setUnlocalizedName(ItemInfo.WRENCH_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.WRENCH_ICON);
	}
}
