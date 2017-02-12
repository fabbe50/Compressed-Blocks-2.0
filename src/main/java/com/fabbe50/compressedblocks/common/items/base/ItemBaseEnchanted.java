package com.fabbe50.compressedblocks.common.items.base;

import com.thefifthidiot.tficore.common.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by fabbe50 on 03/02/2017.
 */
public class ItemBaseEnchanted extends ItemBase {
    //INFO: WILL BE MOVED WITH TFICORE UPDATE
    public ItemBaseEnchanted(String itemName, CreativeTabs tab) {
        super(itemName, tab);
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
