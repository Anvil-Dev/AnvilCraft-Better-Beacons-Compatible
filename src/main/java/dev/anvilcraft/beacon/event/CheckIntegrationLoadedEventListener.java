package dev.anvilcraft.beacon.event;

import dev.dubhe.anvilcraft.api.event.CheckIntegrationLoadedEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class CheckIntegrationLoadedEventListener {
    @SubscribeEvent
    public static void onHasGuide(CheckIntegrationLoadedEvent event) {
        if (event.getId().equals("better_beacons")) {
            event.setLoaded();
        }
    }
}
