package net.collywobbles.greensmod.block;

import net.collywobbles.greensmod.GreensMod;
import net.collywobbles.greensmod.block.custom.BreadOvenBlock;
import net.collywobbles.greensmod.item.ModCreativeModeTab;
import net.collywobbles.greensmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.collywobbles.greensmod.block.custom.JumpyBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GreensMod.MOD_ID);

    public static final RegistryObject<Block> JUMP_BLOCK = registerObject("jumpy_block",
            () -> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MORE_GREENS);

    public static final RegistryObject<Block> BREAD_OVEN_BLOCK = registerObject("bread_oven_block",
            () -> new BreadOvenBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MORE_GREENS);




    private static <T extends Block>RegistryObject<T> registerObject(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerObjectItem(name, toReturn, tab);
        return toReturn;
    }

    private static<T extends Block> RegistryObject<Item> registerObjectItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
