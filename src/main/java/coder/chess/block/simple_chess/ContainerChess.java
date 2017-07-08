package coder.chess.block.simple_chess;

import coder.chess.item.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

import javax.annotation.Nullable;

/**
 * Created by Freestyle Coder on 6/28/2017.
 */
public class ContainerChess extends Container{
    public ContainerChess(InventoryPlayer playerInv, final TileEntityChess chess) {
        IItemHandler inventory = chess.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);

        //add board slots
        for(int i = 0; i < Constants.SLOTS_X; i++) {
            for(int j = 0; j < Constants.SLOTS_Y; j++) {
                addSlotToContainer(new SlotChess(chess, inventory,
                        Constants.BOARD_START_X + j * Constants.SLOT_SIZE,
                        Constants.BOARD_START_Y + i * Constants.SLOT_SIZE,
                        i * Constants.SLOTS_X + j));
            }
        }

        //add white side
        for(int i = 0; i < Constants.SIDE_SLOTS / 2; i++) {
            SlotChess slot = new SlotChess(chess, inventory,
                    Constants.WHITE_START_X,
                    Constants.WHITE_START_Y + i * Constants.SIDE_SLOT_SIZE,
                    Constants.WHITE_INDEX_START + i);
            addSlotToContainer(slot);
        }

        //add black side
        for(int i = 0; i < Constants.SIDE_SLOTS / 2; i++) {
            SlotChess slot = new SlotChess(chess, inventory,
                    Constants.BLACK_START_X,
                    Constants.BLACK_START_Y + i * Constants.SIDE_SLOT_SIZE,
                    Constants.BLACK_INDEX_START + i);
            addSlotToContainer(slot);
        }
    }

    @Nullable
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        return null;
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
