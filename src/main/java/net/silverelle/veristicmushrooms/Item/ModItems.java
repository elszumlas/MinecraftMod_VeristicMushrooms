package net.silverelle.veristicmushrooms.Item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silverelle.veristicmushrooms.Item.custom.VeristicMushroomsFood;
import net.silverelle.veristicmushrooms.VeristicMushrooms;

import java.util.List;

public class ModItems {
    // All Items made for the mod
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VeristicMushrooms.MOD_ID);

    public static final RegistryObject<Item> MYCOLOGYBOOK = ITEMS.register("mycologybook", () -> new Item(new Item.Properties())
    {
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.mycologybook"));
            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });
    public static final RegistryObject<Item> RAW_BROWNBUTTON = ITEMS.register("raw_brownbutton", () -> new Item(new Item.Properties().food(VeristicMushroomsFood.RAW_BROWNBUTTON))
    {
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            if (Screen.hasShiftDown()) { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.raw_brownbutton")); }
            else { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.shift_down")); }
            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });
    public static final RegistryObject<Item> COOKED_BROWNBUTTON = ITEMS.register("cooked_brownbutton", () -> new Item(new Item.Properties().food(VeristicMushroomsFood.COOKED_BROWNBUTTON))
    {
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            if (Screen.hasShiftDown()) { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.cooked_brownbutton")); }
            else { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.shift_down")); }
            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });
    public static final RegistryObject<Item> RAW_BAYBOLETE = ITEMS.register("raw_baybolete", () -> new Item(new Item.Properties().food(VeristicMushroomsFood.RAW_BAYBOLETE))
    {
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            if (Screen.hasShiftDown()) { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.raw_baybolete")); }
            else { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.shift_down")); }
            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });
    public static final RegistryObject<Item> COOKED_BAYBOLETE = ITEMS.register("cooked_baybolete", () -> new Item(new Item.Properties().food(VeristicMushroomsFood.COOKED_BAYBOLETE))
    {
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            if (Screen.hasShiftDown()) { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.cooked_baybolete")); }
            else { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.shift_down")); }
            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });
    public static final RegistryObject<Item> RAW_CHANTERELLE = ITEMS.register("raw_chanterelle", () -> new Item(new Item.Properties())
    {
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            if (Screen.hasShiftDown()) { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.raw_chanterelle")); }
            else { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.shift_down")); }
            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });
    public static final RegistryObject<Item> COOKED_CHANTERELLE = ITEMS.register("cooked_chanterelle", () -> new Item(new Item.Properties())
    {
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            if (Screen.hasShiftDown()) { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.cooked_chanterelle")); }
            else { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.shift_down")); }
            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });
    public static final RegistryObject<Item> RAW_DEATHCAP = ITEMS.register("raw_deathcap", () -> new Item(new Item.Properties().food(VeristicMushroomsFood.RAW_DEATHCAP))
    {
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            if (Screen.hasShiftDown()) { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.raw_deathcap")); }
            else { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.shift_down")); }
            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });
    public static final RegistryObject<Item> COOKED_DEATHCAP = ITEMS.register("cooked_deathcap", () -> new Item(new Item.Properties().food(VeristicMushroomsFood.COOKED_DEATHCAP))
    {
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            if (Screen.hasShiftDown()) { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.cooked_deathcap")); }
            else { pTooltipComponents.add(Component.translatable("tooltip.veristicmushrooms.shift_down")); }
            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
