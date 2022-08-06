package com.github.gamingoninsulin.simpletech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.github.gamingoninsulin.simpletech.SimpleTech.MOD_ID;
import static com.github.gamingoninsulin.simpletech.item.ModCreativeTab.CREATIVESIMPLEITEMSTAB;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
// Aluminum
    // Aluminum Chunk
    public static final RegistryObject<Item> ALUMINUM_CHUNK = ITEMS.register("aluminum_chunk",
    () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Aluminum Dust
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Aluminum Ingot
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Aluminum Nugget
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));


    // Aluminum Plate
    public static final RegistryObject<Item> ALUMINUM_PLATE = ITEMS.register("aluminum_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

// Brass
    // Brass Dust
    public static final RegistryObject<Item> BRASS_DUST = ITEMS.register("brass_dust",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Brass Ingot
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Brass Nugget
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Brass Plate
    public static final RegistryObject<Item> BRASS_PLATE = ITEMS.register("brass_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));


// Bronze
    // Brass Dust
    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Brass Ingot
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Brass Nugget
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Brass Plate
    public static final RegistryObject<Item> BRONZE_PLATE = ITEMS.register("bronze_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

// Copper
    // Copper Dust
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Copper Plate
    public static final RegistryObject<Item> COPPER_PLATE = ITEMS.register("copper_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Copper Cable
    public static final RegistryObject<Item> COPPER_CABLE = ITEMS.register("copper_cable",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Copper Insulated Cable
    public static final RegistryObject<Item> COPPER_INSULATED_CABLE = ITEMS.register("copper_insulated_cable",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

// Nickel
    // Nickel Nugget
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Nickel Ingot
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Nickel Plate
    public static final RegistryObject<Item> NICKEL_PLATE = ITEMS.register("nickel_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

// Tin
    // Tin Dust
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Tin Ingot
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Tin Plate
    public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("tin_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Tin Cable
    public static final RegistryObject<Item> TIN_CABLE = ITEMS.register("tin_cable",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Tin Nugget
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

// Zinc
    // Zinc Dust
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Zinc Ingot
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Zinc Plate
    public static final RegistryObject<Item> ZINC_PLATE = ITEMS.register("zinc_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Zinc Nugget
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));


// tree stuff
    // Tree Sap
    public static final RegistryObject<Item> TREE_SAP = ITEMS.register("tree_sap",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Tree Tap
    public static final RegistryObject<Item> TREE_TAP = ITEMS.register("tree_tap",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Silicon Plate
    public static final RegistryObject<Item> SILICON_PLATE = ITEMS.register("silicon_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Rubber
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Rubber Sapling
    public static final RegistryObject<Item> RUBBER_SAPLING = ITEMS.register("rubber_sapling",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Rubber Tree Door
    public static final RegistryObject<Item> RUBBER_TREE_DOOR = ITEMS.register("rubber_tree_door",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Rubber Tree Trap Door
    public static final RegistryObject<Item> RUBBER_TREE_TRAP_DOOR = ITEMS.register("rubber_tree_trap_door",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

// tools and gear
    // Tech Wrench
    public static final RegistryObject<Item> TECH_WRENCH = ITEMS.register("tech_wrench",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

// Plates (for existing ore types)
    // Iron Plate
    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Gold Plate
    public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Emerald Plate
    public static final RegistryObject<Item> EMERALD_PLATE = ITEMS.register("emerald_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Diamond Plate
    public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Netherite Plate
    public static final RegistryObject<Item> NETHERITE_PLATE = ITEMS.register("netherite_plate",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

// Cables (for existing ore types)
    // Gold cable
    public static final RegistryObject<Item> GOLD_CABLE = ITEMS.register("gold_cable",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));

    // Gold insulated cable
    public static final RegistryObject<Item> GOLD_INSULATED_CABLE = ITEMS.register("gold_insulated_cable",
            () -> new Item(new Item.Properties().tab(CREATIVESIMPLEITEMSTAB)));


    // down here are only the registration that passes through to SimpleTech
    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}