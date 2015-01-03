package com.Munch1231.letsmodreboot.init;

import com.Munch1231.letsmodreboot.item.ItemLMRB;
import com.Munch1231.letsmodreboot.item.ItemPhone;
import com.Munch1231.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB phone = new ItemPhone();

    public static void init() {
        GameRegistry.registerItem(phone, "phone");
    }
}
