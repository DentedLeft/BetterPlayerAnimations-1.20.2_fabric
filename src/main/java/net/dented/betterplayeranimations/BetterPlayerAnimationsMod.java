package net.dented.betterplayeranimations;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterPlayerAnimationsMod implements ModInitializer {
	public static final String MOD_ID = "betterplayeranimations";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Registering better player animations");
	}

}