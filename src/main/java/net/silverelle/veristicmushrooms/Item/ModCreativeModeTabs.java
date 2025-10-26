package net.silverelle.veristicmushrooms.Item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.silverelle.veristicmushrooms.VeristicMushrooms;
import net.silverelle.veristicmushrooms.block.ModBlocks;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VeristicMushrooms.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VERISTICMUSHROOMS_ITEMS_TAB = CREATIVE_MODE_TABS.register("veristicmushrooms_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_BAYBOLETE.get()))
                    .title(Component.translatable("creativetab.veristicmushrooms_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MYCOLOGYBOOK.get());

                        output.accept(ModItems.RAW_BROWNBUTTON.get());
                        output.accept(ModItems.RAW_BAYBOLETE.get());
                        output.accept(ModItems.RAW_CHANTERELLE.get());
                        output.accept(ModItems.RAW_DEATHCAP.get());

                        output.accept(ModItems.COOKED_BROWNBUTTON.get());
                        output.accept(ModItems.COOKED_BAYBOLETE.get());
                        output.accept(ModItems.COOKED_CHANTERELLE.get());
                        output.accept(ModItems.COOKED_DEATHCAP.get());

                        output.accept(ModBlocks.BAYBOLETE_BLOCK.get());

                    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
