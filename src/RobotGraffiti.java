import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
Robot TomatoHead = new Robot();
TomatoHead.miniaturize();
TomatoHead.setSpeed(30);
TomatoHead.penDown();
TomatoHead.setPenWidth(11);
	TomatoHead.move(100);
	TomatoHead.turn(90);
for (int i = 0; i < 180; i++) {
	TomatoHead.turn(1);
	TomatoHead.move(1);
}
//This recipe draws the first letter of your name using the Robot

//1. Create a class called RobotGraffiti
//2. Use the Robot to draw the first letter of your name
//HINT: Use the RobotSquare recipe to help remember how to draw using Robot
//3. BONUS: Write your entire first name using the Robot

}
}


