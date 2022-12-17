package net.collywobbles.greensmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    //Create Multiple tabs
    public static final CreativeModeTab MORE_GREENS = new CreativeModeTab("More Greens") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PEACH_SEEDS.get());
        }
    };
}
