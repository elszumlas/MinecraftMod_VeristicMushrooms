package net.silverelle.veristicmushrooms.Item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silverelle.veristicmushrooms.VeristicMushrooms;

public class ModItems {
    // All Items made for the mod
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VeristicMushrooms.MOD_ID);

    public static final RegistryObject<Item> MYCOLOGYBOOK = ITEMS.register("mycologybook", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BAYBOLETE = ITEMS.register("raw_baybolete", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COOKED_BAYBOLETE = ITEMS.register("cooked_baybolete", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CHANTERELLE = ITEMS.register("raw_chanterelle", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COOKED_CHANTERELLE = ITEMS.register("cooked_chanterelle", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_DEATHCAP = ITEMS.register("raw_deathcap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COOKED_DEATHCAP = ITEMS.register("cooked_deathcap", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
