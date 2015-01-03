package com.Munch1231.letsmodreboot.creativetab;

import com.Munch1231.letsmodreboot.init.ModItems;
import com.Munch1231.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.phone;
        }

    };
}
