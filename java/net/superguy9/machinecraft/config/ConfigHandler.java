package net.superguy9.machinecraft.config;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {

	private static final String CATEGORY_OPTIONS = "Options";
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		config.save();
	}
}
