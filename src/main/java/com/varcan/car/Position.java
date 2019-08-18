package com.varcan.car;

import com.varcan.control.Command;

/**
 * Date:2019-08-18
 * Author: var.can
 * Desc:
 */
public class Position {
    private int x;
    private int y;

    public Position() {
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

    public void moveForward(Orientation ori){
        move(ori,1);
    }
    public void moveBackward(Orientation ori){
        move(ori,-1);
    }

    public void move(Orientation ori , int step){
        switch (ori){
            case NORTH:
                y+=step;break;
            case SOURTH:
                y-=step;break;
            case WEST:
                x-=step;break;
            case EAST:
                x+=step;break;
            default:break;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
