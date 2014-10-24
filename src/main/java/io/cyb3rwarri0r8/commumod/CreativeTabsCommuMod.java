package io.cyb3rwarri0r8.commumod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.cyb3rwarri0r8.commumod.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by noah on 5/16/14.
 */
public class CreativeTabsCommuMod extends CreativeTabs {
    public CreativeTabsCommuMod(String tabLabel)
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
