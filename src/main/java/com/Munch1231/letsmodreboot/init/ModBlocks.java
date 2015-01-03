package com.Munch1231.letsmodreboot.init;

import com.Munch1231.letsmodreboot.block.BlockCloud;
import com.Munch1231.letsmodreboot.block.BlockLMRB;
import com.Munch1231.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB cloud = new BlockCloud();
    public static void init()
    {
        GameRegistry.registerBlock(cloud, "cloud");
    }

}
