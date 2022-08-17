package me.bar.xisuma_inventory;

import net.fabricmc.api.ClientModInitializer;

public class XisumaInventoryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        XisumaInventory.LOGGER.info("Client Mod Initialized!");
    }
}
