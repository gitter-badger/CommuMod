package common.endergriefer.jamoa.help;



import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class RegisterHelper {

    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, Reference.MODID + " " + block.getUnlocalizedName().substring(5));
    }

    // ********************************************************************************************

    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, Reference.MODID + " " + item.getUnlocalizedName().substring(5));
    }

    // ********************************************************************************************

    public static void regToolRecipe(Item item, Item x, Item y, String toolType)
    {
        if (toolType == "pickaxe")
        {
            GameRegistry.addRecipe(new ItemStack(item), new Object[]{
                    "XXX",
                    " Y ",
                    " Y ",
                    'X', x, 'Y', y,
            });
        }
        else if (toolType == "axe")
        {
            GameRegistry.addRecipe(new ItemStack(item), new Object[]{
                    "XX ",
                    "XY ",
                    " Y ",
                    'X', x, 'Y', y,
            });
        }
        else if (toolType == "shovel")
        {
            GameRegistry.addRecipe(new ItemStack(item), new Object[]{
                    " X ",
                    " Y ",
                    " Y ",
                    'X', x, 'Y', y,
            });
        }
        else if (toolType == "hoe")
        {
            GameRegistry.addRecipe(new ItemStack(item), new Object[]{
                    "XX ",
                    " Y ",
                    " Y ",
                    'X', x, 'Y', y,
            });
        }
        else if (toolType == "sword")
        {
            GameRegistry.addRecipe(new ItemStack(item), new Object[]{
                    " X ",
                    " X ",
                    " Y ",
                    'X', x, 'Y', y,
            });
        }
        else
        {
            System.out.println("Error: Cannot register recipe!");
        }
    }

    // ********************************************************************************************

    public static void regArmorRecipe(Item item, Item x, String armortype)
    {
        if (armortype == "helmet")
        {
            GameRegistry.addRecipe(new ItemStack(item), new Object[]{
                    "XXX",
                    "X X",
                    'X', x
            });
        }else if (armortype == "chestplate")
        {
            GameRegistry.addRecipe(new ItemStack(item), new Object[]{
                    "X X",
                    "XXX",
                    "XXX",
                    'X', x,
            });
        }else if (armortype == "leggings")
        {
            GameRegistry.addRecipe(new ItemStack(item), new Object[]{
                    "XXX",
                    "X X",
                    "X X",
                    'X', x,
            });
        } else if (armortype == "boots")
        {
            GameRegistry.addRecipe(new ItemStack(item), new Object[]{
                    "X X",
                    "X X",
                    'X', x
            });
        } else
        {
            System.out.println("Error: Invalid Armor type!");
        }
    }

    // ********************************************************************************************

}
