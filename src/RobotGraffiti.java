import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot bonnie = new Robot();
bonnie.setSpeed(100);
	bonnie.penDown();
bonnie.turn(-90);
	for (int i = 0; i < 180; i++) {
		bonnie.move(1);
	bonnie.turn(-1);
	}
	for (int j = 0; j < 180; j++) {
bonnie.move(1);	
bonnie.turn(1);
}
	}



}
