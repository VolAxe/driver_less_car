package com.varcan;

import com.varcan.car.Orientation;
import com.varcan.car.Position;
import com.varcan.car.impl.DriverLessCar;
import com.varcan.control.Command;
import com.varcan.park.impl.Park;

/**
 * Date:2019-08-18
 * Author: var.can
 * Desc:
 */
public class App {

    public static void main(String[] args) throws Exception {
        DriverLessCar driverLessCar = new DriverLessCar();
        driverLessCar.setOrientation(Orientation.EAST);
        Park park = new Park(4, 4);
        driverLessCar.setPark(park);
        driverLessCar.setPosition(new Position(1,1));
        driverLessCar.move(Command.ANTICLOCKWISE);
        driverLessCar.move(Command.MOVE_FORWARD);
        driverLessCar.move(Command.MOVE_FORWARD);
        driverLessCar.move(Command.MOVE_FORWARD);
        driverLessCar.move(Command.CLOCKWISE);
        driverLessCar.move(Command.MOVE_FORWARD);
        driverLessCar.move(Command.MOVE_FORWARD);
        driverLessCar.move(Command.MOVE_FORWARD);
        Command[] commands = new Command[2];
        commands[0]=Command.MOVE_BACKWARD;
        commands[1]=Command.MOVE_BACKWARD;
        driverLessCar.move(commands);
        System.out.println(driverLessCar);
    }
}
