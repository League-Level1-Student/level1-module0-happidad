package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	private Robot rob;
	Houses(){
		this.rob = new Robot();
	}

	public void drawHouse() {
		rob.setPenColor(255,0,0);
		rob.setSpeed(100);
		rob.penDown();
		rob.move(100);
		rob.turn(90);
		rob.move(10);
		rob.turn(90);
		rob.move(100);
		// draw green grass
		rob.turn(-90);

		rob.setPenColor(96,128,56);
		rob.move(10);
		rob.turn(-90);
	}
	public void run() {
		// move to initial position, lower left corner
		rob.moveTo(10,300);

		for (int i = 0; i <10 ; i++) {
			drawHouse();
		}


		// move robot out of the way
		rob.penUp();
		rob.move(500);

		
	}
}
