package net.just_moonboy.rubidorn.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.just_moonboy.rubidorn.Rubidorn;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public  static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public  static final Item IMPURE_RUBY = registerItem("impure_ruby", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(IMPURE_RUBY);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Rubidorn.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Rubidorn.LOGGER.info("Registering Mod Items for" + Rubidorn.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

