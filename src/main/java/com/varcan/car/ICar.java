package com.varcan.car;

import com.varcan.control.Command;
import com.varcan.exception.OutOfBoundException;

/**
 * Date:2019-08-18
 * Author: var.can
 * Desc:
 */
public interface ICar {

    void move (Command command) throws OutOfBoundException;

    int getPositionX();

    int getPositionY();

    String getOrientation();

}
