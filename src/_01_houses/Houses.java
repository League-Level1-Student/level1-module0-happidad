package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
    private Robot rob;

    Houses() {
        this.rob = new Robot();
    }

    public void drawHouse(String size) {
        if (size.equals("small")) drawHouse(60);
        else if (size.equals("medium")) drawHouse(120);
        else if (size.equals("large")) drawHouse(250);
    }

    public void drawHouse(int height) {
        rob.setPenColor(255, 0, 0);
        rob.setSpeed(100);
        rob.penDown();
        // draw left side
        rob.move(height);
        // draw roof
        rob.turn(90);
        rob.move(30);
        rob.turn(90);
        // draw right side
        rob.move(height);
        // draw green grass
        rob.turn(-90);

        rob.setPenColor(96, 128, 56);
        rob.move(30);
        rob.turn(-90);
    }

    public void run() {
        // move to initial position, lower left corner
        rob.moveTo(10, 500);

        for (int i = 0; i < 10; i++) {
            drawHouse((i + 1) * 10);
        }

        drawHouse("small");
        drawHouse("medium");
        drawHouse("large");


        // move robot out of the way
        rob.penUp();
        rob.move(500);


    }
}
