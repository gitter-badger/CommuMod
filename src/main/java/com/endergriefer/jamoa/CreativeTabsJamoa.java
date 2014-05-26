package com.endergriefer.jamoa;

import com.endergriefer.jamoa.blocks.ModBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by noah on 5/16/14.
 */
public class CreativeTabsJamoa extends CreativeTabs {
    public CreativeTabsJamoa(String tabLabel)
    {
        super(tabLabel);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(ModBlocks.superbiumOre);
    }
}
