package kz.gibusmod.item;

import kz.gibusmod.Gibusmod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gibusmod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GIBUS_TAB = CREATIVE_MODE_TABS.register("gibus_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GIBUS.get()))
                    .title(Component.translatable("creativetab.gibus_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(new ItemStack(ModItems.GIBUS.get()));
                        pOutput.accept(new ItemStack(ModItems.GIBUS_CYLINDER.get()));
                        pOutput.accept(new ItemStack(ModItems.GIBUS_VISOR.get()));
                        pOutput.accept(new ItemStack(ModItems.SPERMA.get()));
    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
