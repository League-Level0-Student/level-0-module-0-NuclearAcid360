/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot Leviathan = new Robot();
Leviathan.miniaturize();
        // 3. Put the robot's pen down
Leviathan.penDown();
Leviathan.setPenWidth(10);
        // 6. Make the robot move as fast as possible
Leviathan.setSpeed(10);

        // 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {

        //         2. Move your robot 200 pixels

Leviathan.move(200);
        //         4. Turn the robot 90 degrees to the right (90 degrees)
Leviathan.turn(90);
}
    }
}
