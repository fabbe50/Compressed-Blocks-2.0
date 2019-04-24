package com.fabbe50.compressedblocks.core.registry;

import com.fabbe50.compressedblocks.common.entities.EntityCorgi;
import com.fabbe50.compressedblocks.core.utils.Utilities;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;

/**
 * Created by fabbe50 on 30/04/2017.
 */
public class EndgameCraftingRegistry {
    public static void init() {
        registerRecipes();
    }

    private static void registerRecipes() {
        ModRegistry.addEndgameRecipe(new ItemStack(Blocks.DRAGON_EGG), new Object[]{new ItemStack(Items.EGG), new ItemStack(ItemRegistry.ENDGAMIUM_NUGGET)});
        ModRegistry.addEndgameRecipe(new ItemStack(Items.NETHER_STAR), new Object[]{new ItemStack(Items.SKULL, 3, 1), new ItemStack(Blocks.SOUL_SAND, 4), new ItemStack(Items.DIAMOND_SWORD)});
        ModRegistry.addEndgameRecipe(new ItemStack(Items.COOKED_FISH, 1, 0), new Object[]{new ItemStack(Items.FISH, 1, 0)});
        ModRegistry.addEndgameRecipe(new ItemStack(Items.COOKED_FISH, 1, 1), new Object[]{new ItemStack(Items.FISH, 1, 1)});
        ModRegistry.addEndgameRecipe(new ItemStack(Items.WHEAT, 1, 0), new Object[]{new ItemStack(Items.WHEAT_SEEDS, 1, 0), new ItemStack(Items.DYE, 1, 15)});
        ModRegistry.addEndgameRecipe(new ItemStack(Blocks.MELON_BLOCK, 1, 0), new Object[]{new ItemStack(Items.MELON_SEEDS, 1, 0), new ItemStack(Items.DYE, 1, 15)});
        ModRegistry.addEndgameRecipe(new ItemStack(Blocks.PUMPKIN, 1, 0), new Object[]{new ItemStack(Items.PUMPKIN_SEEDS, 1, 0), new ItemStack(Items.DYE, 1, 15)});
        ModRegistry.addEndgameRecipe(new ItemStack(Items.BEETROOT, 1, 0), new Object[]{new ItemStack(Items.BEETROOT_SEEDS, 1, 0), new ItemStack(Items.DYE, 1, 15)});
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.TRINKET, 1, 0), new Object[]{new ItemStack(BlockRegistry.COMPRESSED_IRON, 1, 0)});
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.TRINKET, 1, 1), new Object[]{new ItemStack(ItemRegistry.TRINKET, 1, 0), new ItemStack(ItemRegistry.ENDERAPPLE, 1, 1)});
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.TRINKET, 1, 2), new Object[]{new ItemStack(ItemRegistry.TRINKET, 1, 0), new ItemStack(BlockRegistry.ENDERBLOCK, 1, 0)});
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.TRINKET, 1, 3), new Object[]{new ItemStack(ItemRegistry.TRINKET, 1, 0), new ItemStack(Blocks.END_BRICKS, 1, 0), new ItemStack(Blocks.NETHER_BRICK, 1, 0)});
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.POTATO_SINGULARITY, 1, 0), new Object[]{new ItemStack(BlockRegistry.COMPRESSED_POTATO, 9, 7)});
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.ENDGAMIUM_INGOT, 1), new ItemStack(BlockRegistry.NETHER_STAR_BLOCK, 1, 0), new ItemStack(BlockRegistry.COMPRESSED_IRON, 1, 0), new ItemStack(Items.GOLDEN_APPLE, 1, 1), new ItemStack(Items.END_CRYSTAL, 1, 0), new ItemStack(Blocks.DRAGON_EGG), new ItemStack(ItemRegistry.ENDERAPPLE, 1, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.ENDGAMIUM_INGOT, 2), new ItemStack(ItemRegistry.ENDGAMIUM_INGOT, 1, 0), new ItemStack(Items.IRON_INGOT, 1, 0), new ItemStack(Items.NETHER_STAR, 1 ,0));
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.STAFF_WOOD), new ItemStack(Items.STICK, 2), new ItemStack(Blocks.PLANKS, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.STAFF_STONE), new ItemStack(Items.STICK, 2), new ItemStack(Blocks.COBBLESTONE, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.STAFF_IRON), new ItemStack(Items.STICK, 2), new ItemStack(Items.IRON_INGOT, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.STAFF_GOLD), new ItemStack(Items.STICK, 2), new ItemStack(Items.GOLD_INGOT, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.STAFF_DIAMOND), new ItemStack(Items.STICK, 2), new ItemStack(Items.DIAMOND, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(ItemRegistry.STAFF_ENDGAMIUM), new ItemStack(Items.STICK, 2), new ItemStack(ItemRegistry.ENDGAMIUM_INGOT, 1));

        ModRegistry.addEndgameRecipe(Utilities.getSpawnEggWithEntity(EntityCorgi.class), new ItemStack(BlockRegistry.COMPRESSED_POTATO, 1, 1), PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM, 1), PotionTypes.HEALING));

        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.WHITE_SHULKER_BOX, 1), new ItemStack(Blocks.WHITE_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.ORANGE_SHULKER_BOX, 1), new ItemStack(Blocks.ORANGE_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.MAGENTA_SHULKER_BOX, 1), new ItemStack(Blocks.MAGENTA_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.LIGHT_BLUE_SHULKER_BOX, 1), new ItemStack(Blocks.LIGHT_BLUE_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.YELLOW_SHULKER_BOX, 1), new ItemStack(Blocks.YELLOW_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.LIME_SHULKER_BOX, 1), new ItemStack(Blocks.LIME_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.PINK_SHULKER_BOX, 1), new ItemStack(Blocks.PINK_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.GRAY_SHULKER_BOX, 1), new ItemStack(Blocks.GRAY_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.SILVER_SHULKER_BOX, 1), new ItemStack(Blocks.SILVER_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.CYAN_SHULKER_BOX, 1), new ItemStack(Blocks.CYAN_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.BLUE_SHULKER_BOX, 1), new ItemStack(Blocks.BLUE_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.BROWN_SHULKER_BOX, 1), new ItemStack(Blocks.BROWN_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.GREEN_SHULKER_BOX, 1), new ItemStack(Blocks.GREEN_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.RED_SHULKER_BOX, 1), new ItemStack(Blocks.RED_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
        ModRegistry.addEndgameRecipe(new ItemStack(BlockRegistry.BLACK_SHULKER_BOX, 1), new ItemStack(Blocks.BLACK_SHULKER_BOX, 1), new ItemStack(Blocks.CHEST, 1));
    }
}
