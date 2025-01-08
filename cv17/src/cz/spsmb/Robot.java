package cz.spsmb;

/**
 *
 * Robot class
 *
 */
public class Robot {

    /**
     * Move the robot by distance
     * @param distance
     */
    public void move(double distance) {
        System.out.println("I'm moving " + distance);
    }

    /**
     * Makes the robot do work
     */
    public void work() {

        System.out.println("I'm working");

    }

    /**
     * Turns on the robot
     */
    public void turnOn() {

        System.out.println("Robot has turned on");

    }

    /**
     * Turns off the robot
     */
    public void turnOff() {

        System.out.println("Robot has turned off");

    }

}
