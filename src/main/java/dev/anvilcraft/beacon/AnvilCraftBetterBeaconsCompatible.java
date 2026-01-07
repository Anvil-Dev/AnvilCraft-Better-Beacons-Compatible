package dev.anvilcraft.beacon;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(AnvilCraftBetterBeaconsCompatible.MOD_ID)
public class AnvilCraftBetterBeaconsCompatible {
    public static final String MOD_ID = "anvilcraft_better_beacons_compatible";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AnvilCraftBetterBeaconsCompatible(IEventBus modEventBus, ModContainer modContainer) {
    }
}
