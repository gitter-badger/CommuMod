package io.cyb3rwarri0r8.commumod.items;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;

/**
 * Created by noah on 10/27/14.
 */
public class ItemPureWaterBucket extends ItemBucket {

    public ItemPureWaterBucket(Block block) {
        super(block);
        setUnlocalizedName("pureWaterBucket");
        setContainerItem(Items.bucket);

    }
}
