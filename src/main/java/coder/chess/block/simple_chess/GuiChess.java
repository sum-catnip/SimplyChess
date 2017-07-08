package coder.chess.block.simple_chess;

import coder.chess.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Freestyle Coder on 6/28/2017.
 */
public class GuiChess extends GuiContainer {
    private InventoryPlayer m_playerInv;
    private static final ResourceLocation BG_TEXTURE = new ResourceLocation(Reference.MODID, "textures/gui/chess_board.png");

    public GuiChess(Container container, InventoryPlayer playerInv) {
        super(container);
        this.xSize = 256;
        this.ySize = 176;
        this.m_playerInv = playerInv;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1,1,1,1);
        mc.getTextureManager().bindTexture(BG_TEXTURE);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        drawTexturedModalRect(x,y,0,0,xSize,ySize);
    }
}
