package coder.chess.block.simple_chess;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

/**
 * Created by Freestyle Coder on 6/29/2017.
 */
public class SlotChess extends SlotItemHandler {
    private TileEntityChess m_chess;

    public SlotChess(TileEntityChess chess, IItemHandler inventory, int posX, int posY, int index) {
        super(inventory, index, posX, posY);
        m_chess = chess;
    }

    @Override
    public void onSlotChanged() {
        m_chess.markDirty();
    }
}
