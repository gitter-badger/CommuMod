package io.cyb3rwarri0r8.commumod.items.food_items;

import io.cyb3rwarri0r8.commumod.main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * CommuMod - A Minecraft Modification
 * Copyright (C) 2014 Cyb3rWarri0r8
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class FoodTicTac extends ItemFood {
    public FoodTicTac(int hunger, int saturation, boolean isWolfFood) {
        super(hunger, saturation, isWolfFood);
        setUnlocalizedName("ticTac");
        setCreativeTab(main.modTab);
    }

    @Override
    protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_) {
        super.onFoodEaten(p_77849_1_, p_77849_2_, p_77849_3_);
        p_77849_3_.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 300));
    }
}
