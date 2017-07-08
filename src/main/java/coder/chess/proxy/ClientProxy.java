package coder.chess.proxy;

import coder.chess.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import javax.annotation.Resource;

/**
 * Created by Freestyle Coder on 6/27/2017.
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(
                Reference.MODID + ":" + id, "inventory"));
    }
}
