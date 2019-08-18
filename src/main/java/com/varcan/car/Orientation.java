package com.varcan.car;

/**
 * Date:2019-08-18
 * Author: var.can
 * Desc:
 */
public enum Orientation {

    NORTH,
    SOURTH,
    WEST,
    EAST;

    public Orientation turnOrientation(boolean isClockWise){
        switch (this){
            case NORTH: return isClockWise?EAST:WEST;
            case EAST: return isClockWise?SOURTH:NORTH;
            case WEST: return isClockWise?NORTH:SOURTH;
            case SOURTH: return isClockWise?WEST:EAST;
            default: return null;
        }
    }
}
