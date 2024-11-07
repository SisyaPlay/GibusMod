package kz.gibusmod.item.client;

import kz.gibusmod.Gibusmod;
import kz.gibusmod.item.custom.GibusArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GibusArmorModel extends GeoModel<GibusArmorItem> {
    @Override
    public ResourceLocation getModelResource(GibusArmorItem gibusArmorItem) {
        return new ResourceLocation(Gibusmod.MOD_ID, "geo/gibus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GibusArmorItem gibusArmorItem) {
        return new ResourceLocation(Gibusmod.MOD_ID, "textures/armor/gibus_3d.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GibusArmorItem gibusArmorItem) {
        return new ResourceLocation(Gibusmod.MOD_ID, "animations/gibus.animation.json");
    }
}
