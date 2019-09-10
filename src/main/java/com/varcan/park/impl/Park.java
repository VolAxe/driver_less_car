package com.varcan.park.impl;

import com.varcan.car.Position;
import com.varcan.park.IPark;

/**
 * Date:2019-08-18
 * Author: var.can
 * Desc:
 */
public class Park implements IPark {
    private int x;
    private int y;

    public Park(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean isNotInPark(Position pos){
        return pos.getX()<=0 || pos.getX()>this.x || pos.getY()<=0 || pos.getY() >this.y;
    }

    @Override
    public String toString() {
        return "Park{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
