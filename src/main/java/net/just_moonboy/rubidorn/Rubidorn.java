package net.just_moonboy.rubidorn;

import net.fabricmc.api.ModInitializer;

import net.just_moonboy.rubidorn.item.ModItemGroups;
import net.just_moonboy.rubidorn.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rubidorn implements ModInitializer {
	public  static final String MOD_ID = "rubidorn";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}