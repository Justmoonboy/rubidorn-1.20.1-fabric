package net.just_moonboy.rubidorn.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.just_moonboy.rubidorn.Rubidorn;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.DEEPSLATE_IRON_ORE;
import static net.minecraft.block.Blocks.REDSTONE_ORE;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block IMPURE_RUBY_ORE = registerBlock("impure_ruby_ore",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE_IRON_ORE).strength(4.5f, 3.0f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Rubidorn.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Rubidorn.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Rubidorn.LOGGER.info("Registering ModBlocks for " + Rubidorn.MOD_ID);
    }
}