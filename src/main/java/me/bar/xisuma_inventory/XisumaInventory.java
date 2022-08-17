package me.bar.xisuma_inventory;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XisumaInventory implements ModInitializer {

	public static final String MOD_ID = "xisuma_inventory";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mod Initialized!");
	}
}
