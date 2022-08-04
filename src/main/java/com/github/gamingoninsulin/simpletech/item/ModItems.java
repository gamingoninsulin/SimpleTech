package com.github.gamingoninsulin.simpletech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.github.gamingoninsulin.simpletech.SimpleTech.MOD_ID;
import static com.github.gamingoninsulin.simpletech.item.ModCreativeTab.CreativeSimpleItemsTab;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
// Aluminum
    // Aluminum Chunk
    public static final RegistryObject<Item> ALUMINUM_CHUNK = ITEMS.register("aluminum_chunk",
    () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Aluminum Dust
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Aluminum Ingot
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Aluminum Nugget
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));


    // Aluminum Plate
    public static final RegistryObject<Item> ALUMINUM_PLATE = ITEMS.register("aluminum_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

// Brass
    // Brass Dust
    public static final RegistryObject<Item> BRASS_DUST = ITEMS.register("brass_dust",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Brass Ingot
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Brass Nugget
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Brass Plate
    public static final RegistryObject<Item> BRASS_PLATE = ITEMS.register("brass_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));


// Bronze
    // Brass Dust
    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Brass Ingot
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Brass Nugget
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Brass Plate
    public static final RegistryObject<Item> BRONZE_PLATE = ITEMS.register("bronze_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

// Copper
    // Copper Dust
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Copper Plate
    public static final RegistryObject<Item> COPPER_PLATE = ITEMS.register("copper_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Copper Cable
    public static final RegistryObject<Item> COPPER_CABLE = ITEMS.register("copper_cable",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Copper Insulated Cable
    public static final RegistryObject<Item> COPPER_INSULATED_CABLE = ITEMS.register("copper_insulated_cable",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

// Nickel
    // Nickel Nugget
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Nickel Ingot
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Nickel Plate
    public static final RegistryObject<Item> NICKEL_PLATE = ITEMS.register("nickel_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

// Tin
    // Tin Dust
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Tin Ingot
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Tin Plate
    public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("tin_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Tin Cable
    public static final RegistryObject<Item> TIN_CABLE = ITEMS.register("tin_cable",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Tin Nugget
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

// Zinc
    // Zinc Dust
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Zinc Ingot
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Zinc Plate
    public static final RegistryObject<Item> ZINC_PLATE = ITEMS.register("zinc_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Zinc Nugget
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));


// tree stuff
    // Tree Sap
    public static final RegistryObject<Item> TREE_SAP = ITEMS.register("tree_sap",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Tree Tap
    public static final RegistryObject<Item> TREE_TAP = ITEMS.register("tree_tap",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Silicon Plate
    public static final RegistryObject<Item> SILICON_PLATE = ITEMS.register("silicon_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Rubber
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Rubber Sapling
    public static final RegistryObject<Item> RUBBER_SAPLING = ITEMS.register("rubber_sapling",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

// tools and gear
    // Tech Wrench
    public static final RegistryObject<Item> TECH_WRENCH = ITEMS.register("tech_wrench",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

// Plates (for existing ore types)
    // Iron Plate
    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Gold Plate
    public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Emerald Plate
    public static final RegistryObject<Item> EMERALD_PLATE = ITEMS.register("emerald_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Diamond Plate
    public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

    // Netherite Plate
    public static final RegistryObject<Item> NETHERITE_PLATE = ITEMS.register("netherite_plate",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));

// Cables (for existing ore types)
    // Gold cable
    public static final RegistryObject<Item> GOLD_CABLE = ITEMS.register("gold_cable",
            () -> new Item(new Item.Properties().tab(CreativeSimpleItemsTab)));


    // down here are only the registration that passes through to SimpleTech
    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}