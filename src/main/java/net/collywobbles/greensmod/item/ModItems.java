package net.collywobbles.greensmod.item;

import net.collywobbles.greensmod.GreensMod;
import net.collywobbles.greensmod.item.custom.BaguetteItem;
import net.collywobbles.greensmod.item.custom.StandardVegFruit;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GreensMod.MOD_ID);

    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(BaguetteItem.BAGUETTE)));

    public static final RegistryObject<Item> BROCCOLI = ITEMS.register("broccoli",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> RADISH = ITEMS.register("radish",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> SQUASH = ITEMS.register("squash",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> EGGPLANT = ITEMS.register("eggplant",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> MANGO = ITEMS.register("mango",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> PEAR = ITEMS.register("pear",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> GRAPES = ITEMS.register("grapes",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> POMEGRANATE = ITEMS.register("pomegranate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS).food(StandardVegFruit.STANDARDVEGFRUIT)));

    public static final RegistryObject<Item> BROCCOLI_SEEDS = ITEMS.register("broccoli_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
            public static final RegistryObject<Item> CABBAGE_SEEDS = ITEMS.register("cabbage_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> RADISH_SEEDS = ITEMS.register("radish_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> SQUASH_SEEDS = ITEMS.register("squash_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> EGGPLANT_SEEDS = ITEMS.register("eggplant_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> MANGO_SEEDS = ITEMS.register("mango_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> PEACH_SEEDS = ITEMS.register("peach_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> PEAR_SEEDS = ITEMS.register("pear_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> GRAPES_SEEDS = ITEMS.register("grapes_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> POMEGRANATE_SEEDS = ITEMS.register("pomegranate_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static final RegistryObject<Item> BANANA_SEEDS = ITEMS.register("banana_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));


    public static final RegistryObject<Item> EMPTY_JAR = ITEMS.register("empty_jar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_GREENS)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
