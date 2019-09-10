package com.varcan.car.impl;

import com.varcan.car.ICar;
import com.varcan.car.Orientation;
import com.varcan.car.Position;
import com.varcan.control.Command;
import com.varcan.exception.OutOfBoundException;
import com.varcan.park.impl.Park;

import java.util.ArrayList;

/**
 * Date:2019-08-18
 * Author: var.can
 * Desc:
 */
public class DriverLessCar implements ICar {

    private Orientation orientation;

    private Position position;

    private Park park;

    public DriverLessCar() {
    }

    public DriverLessCar(Orientation orientation, Position position, Park park) {
        this.orientation = orientation;
        this.position = position;
        this.park = park;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
    }

    /**
     * move command
     * @param command
     * @throws OutOfBoundException
     */
    @Override
    public void move(Command command) throws OutOfBoundException {
        if (command==null){
            throw new RuntimeException("Unknow command");
        }
        switch (command){
            case CLOCKWISE:
                this.setOrientation(orientation.turnOrientation(true));
                break;
            case ANTICLOCKWISE:
                this.setOrientation(orientation.turnOrientation(false));
                break;
            case MOVE_FORWARD:
                position.moveForward(orientation);
                checkMove(park,position);
                break;
            case MOVE_BACKWARD:
                position.moveBackward(orientation);
                checkMove(park,position);
                break;
        }
    }

    public void move(Command[] commands) throws OutOfBoundException {
        System.out.println("1111");
        for (Command command : commands) {
            move(command);
        }
    }

    public void move(ArrayList<Command> commands)throws OutOfBoundException{
        for (Command command : commands) {
            move(command);
        }
    }

    public void checkMove(Park park, Position position) throws OutOfBoundException{
        if (park.isNotInPark(position)){
            throw new OutOfBoundException("Out Of Bound");
        }
    }

    @Override
    public int getPositionX() {
        return position.getX();
    }

    @Override
    public int getPositionY() {
        return position.getY();
    }

    @Override
    public String getOrientation() {
        return orientation.name();
    }

    @Override
    public String toString() {
        return "DriverLessCar{" +
                "orientation=" + orientation +
                ", position=" + position +
                ", park=" + park +
                '}';
    }
}
