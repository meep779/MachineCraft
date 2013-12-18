package net.superguy9.machinecraft.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items {

	public static Item wrench;
	
	public static void init() {
		wrench = new ItemWrench(ItemInfo.WRENCH_ID);
	}

	public static void addNames() {
		LanguageRegistry.addName(wrench, ItemInfo.WRENCH_NAME);
	}
}
