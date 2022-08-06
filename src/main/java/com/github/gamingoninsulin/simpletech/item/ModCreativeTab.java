package com.github.gamingoninsulin.simpletech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.github.gamingoninsulin.simpletech.item.ModItems.ALUMINUM_DUST;
import static com.github.gamingoninsulin.simpletech.item.ModItems.ALUMINUM_INGOT;

public class ModCreativeTab {
    public static final CreativeModeTab CREATIVESIMPLEITEMSTAB = new CreativeModeTab("SimpleTechItemsTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ALUMINUM_DUST.get());
        }
    };

    public static final CreativeModeTab CreativeSimpleMachinesTab = new CreativeModeTab("SimpleTechMachinesTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ALUMINUM_INGOT.get());
        }
    };
}