package net.superguy9.machinecraft.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import net.superguy9.machinecraft.items.ItemInfo;

public class ConfigHandler {

	private static final String CATEGORY_ITEMS = "Items";
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		ItemInfo.WRENCH_ID = config.getItem(CATEGORY_ITEMS, ItemInfo.WRENCH_KEY, ItemInfo.WRENCH_DEFAULT).getInt() - 256;
		
		config.save();
	}
}
