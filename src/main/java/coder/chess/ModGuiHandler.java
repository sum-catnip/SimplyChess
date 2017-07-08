package coder.chess;

import coder.chess.block.simple_chess.ContainerChess;
import coder.chess.block.simple_chess.GuiChess;
import coder.chess.block.simple_chess.TileEntityChess;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by Freestyle Coder on 6/28/2017.
 */
public class ModGuiHandler implements IGuiHandler{
    public static final int SIMPLE_CHESS = 0;

    @Override
    public Container getServerGuiElement(int ID, EntityPlayer playerIn, World worldIn, int x, int y, int z) {
        switch(ID) {
            case SIMPLE_CHESS:
                return new ContainerChess(playerIn.inventory, (TileEntityChess)worldIn.getTileEntity(new BlockPos(x, y, z)));
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer playerIn, World worldIn, int x, int y, int z) {
        switch(ID) {
            case SIMPLE_CHESS:
                return new GuiChess(getServerGuiElement(ID, playerIn, worldIn, x, y, z), playerIn.inventory);
            default:
                return null;
        }
    }
}
