package net.just_moonboy.rubidorn.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.just_moonboy.rubidorn.Rubidorn;
import net.just_moonboy.rubidorn.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Rubidorn.MOD_ID, "ruby" ),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.IMPURE_RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);

                    }).build());


    public static void registerItemGroups() {
        Rubidorn.LOGGER.info("Registering Item Groups for " + Rubidorn.MOD_ID);
    }
}
