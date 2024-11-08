package kz.gibusmod.item;

import kz.gibusmod.Gibusmod;
import kz.gibusmod.item.custom.GibusArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gibusmod.MOD_ID);

    public static final RegistryObject<Item> GIBUS = ITEMS.register("gibus",
            () -> new GibusArmorItem(ModArmorMaterials.GIBUS, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> GIBUS_VISOR = ITEMS.register("gibus_visor",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> GIBUS_CYLINDER = ITEMS.register("gibus_cylinder",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> SPERMA = ITEMS.register("sperma",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
