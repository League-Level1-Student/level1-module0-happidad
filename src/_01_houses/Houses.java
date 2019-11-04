package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
    private Robot rob;

    Houses() {
        this.rob = new Robot();
    }

    public void drawHouse(String size, String color, String roof) {
        if (size.equals("small")) drawPeakedRoofHouse(60,color);
        else if (size.equals("medium")) drawPeakedRoofHouse(120,color);
        else if (size.equals("large")) drawSquareRoofHouse(250,color);
    }
    public void drawSquareRoof(){
        // draw roof
        rob.turn(90);
        rob.move(30);
        rob.turn(90);
    }

    public void drawPeakedRoof(){
        // draw roof
        rob.turn(45);
        rob.move(25);
        rob.turn(90);
        rob.move(25);
        rob.turn(45);

    }

    public void drawPeakedRoofHouse( int height, String color ){
        drawHouse(height,color,"peaked");
    }

    public void drawSquareRoofHouse( int height, String color ){
        drawHouse(height,color,"square");
    }
    public void drawHouse(int height, String color, String roof) {
        if (color.equals("red")) rob.setPenColor(255, 0, 0);
        else if (color.equals("green")) rob.setPenColor(0, 255, 0);
        else if (color.equals("blue")) rob.setPenColor(0, 0, 255);
        else rob.setPenColor(0, 0, 0);
        rob.setSpeed(100);
        rob.penDown();
        // draw left side
        rob.move(height);

        if (roof.equals("peaked")) drawPeakedRoof();
        else drawSquareRoof();

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
            drawPeakedRoofHouse((i + 1) * 10,"red");
        }

        drawHouse("small","blue","square");
        drawHouse("medium","green", "square");
        drawHouse("large","unknown", "square");


        // move robot out of the way
        rob.penUp();
        rob.move(500);


    }
}
