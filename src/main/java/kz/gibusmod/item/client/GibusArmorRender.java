package kz.gibusmod.item.client;

import kz.gibusmod.item.custom.GibusArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GibusArmorRender extends GeoArmorRenderer<GibusArmorItem> {
    public GibusArmorRender() {
        super(new GibusArmorModel());
    }
}
