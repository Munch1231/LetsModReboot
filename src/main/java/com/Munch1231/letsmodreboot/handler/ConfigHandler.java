package com.Munch1231.letsmodreboot.handler;

import com.Munch1231.letsmodreboot.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigHandler {
    public static Configuration config;
    public static boolean testValue = false;

    public static void init(File configFile) {
        if (config == null) {
            config = new Configuration(configFile);
            loadConfigs();
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfigs();
        }
    }

    private static void loadConfigs()
    {
        testValue = config.getBoolean("ConfigValue", Configuration.CATEGORY_GENERAL, false, "Example Config Value");

        config.save();
    }
}
