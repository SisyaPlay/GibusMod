package kz.gibusmod.item;

import kz.gibusmod.Gibusmod;
import kz.gibusmod.item.custom.GibusArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gibusmod.MOD_ID);

    public static final RegistryObject<Item> GIBUS = ITEMS.register("gibus",
            () -> new GibusArmorItem(ModArmorMaterials.GIBUS, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
