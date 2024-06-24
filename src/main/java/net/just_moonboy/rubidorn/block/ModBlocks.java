package net.just_moonboy.rubidorn.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.just_moonboy.rubidorn.Rubidorn;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block IMPURE_RUBY_ORE = registerBlock("impure_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(DEEPSLATE_IRON_ORE).strength(4.5f, 3.0f), UniformIntProvider.create(2, 5)));
    public static final Block END_STONE_IMPURE_RUBY_ORE = registerBlock("end_stone_impure_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(END_STONE).strength(3.5f, 9.0f), UniformIntProvider.create(4, 7)));

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