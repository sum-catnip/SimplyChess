package coder.chess.block.simple_chess;

/**
 * Created by Freestyle Coder on 6/30/2017.
 */
public class Constants {
    static final int SLOTS_X = 8;
    static final int SLOTS_Y = 8;
    
    static final int SIDE_SLOTS = 12;

    static final int BOARD_SLOTS = SLOTS_X * SLOTS_Y;
    static final int ALL_SLOTS = BOARD_SLOTS + SIDE_SLOTS;

    static final int WHITE_START_X = 5;
    static final int WHITE_START_Y = 19;
    static final int WHITE_INDEX_START = BOARD_SLOTS;

    static final int BLACK_START_X = 199;
    static final int BLACK_START_Y = 19;
    static final int BLACK_INDEX_START = WHITE_INDEX_START + (SIDE_SLOTS / 2);

    static final int SIDE_SLOT_SIZE = 22;

    //slot size + space between slots
    static final int SLOT_SIZE = 20;
    static final int BOARD_START_X = 32;
    static final int BOARD_START_Y = 3;
}
