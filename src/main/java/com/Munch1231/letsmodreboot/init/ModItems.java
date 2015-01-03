package com.Munch1231.letsmodreboot.init;

import com.Munch1231.letsmodreboot.item.ItemLMRB;
import com.Munch1231.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "Maple Leaf");
    }

}
