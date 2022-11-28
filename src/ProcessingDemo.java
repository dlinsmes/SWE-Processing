import processing.core.PApplet;

public class ProcessingDemo extends PApplet{

    public static void main(String [] args) {
        //pass in a string that's the same as the class name
        PApplet.main("ProcessingDemo");
    }

    public void settings() {
        //set up the window size only here
        size(500, 500);
    }

    //treat floats like doubles
    float x;
    float y;
    float xSpeed;
    float ySpeed;

    //setup() runs once at the beginning of the program
    public void setup() {
        //initialize variables here
        x = 100;
        y = 100;

        //the random() function will generate a float between
        //the two arguments
        xSpeed = random(1, 7);

        //same thing using Math.random()
        ySpeed = (float)(Math.random() * 7 + 1);
    }

    //draw() runs continuously in a loop after setup()
    public void draw() {

        //set the background before you place any objects
        //otherwise the background will draw over the objects
        background(150, 24, 2);

        //coordinate system - (0, 0) is the top-left
        //x increases as you move right
        //y increases as you move down

        //fill() sets the color of any object that comes after it
        //using RGB values
        fill(107, 199, 129);
        rect(x, y, 50, 50);

        x += xSpeed;
        y += ySpeed;

        //width and height are system variables that hold the window
        //width and height

        //check if the rectangle is hitting any of the window edges
        if (x+50 > width || x < 0) {
            //reverse x motion
            xSpeed *= -1;
        }
        if (y+50 > height || y < 0) {
            ySpeed *= -1;
        }

        //check for collision between the two boxes.
        //-if there's a collision, change the color of the
        //stationary box

        //to check for collisions between 2 objects,
        //check for intersections between:
        //right of 1 and the left of 2
        //left of 1 and the right of 2
        //top of 1 and the bottom of 2
        //bottom of 1 and the top of 2
        if (x + 50 >= 250 &&
            x <= 250 + 30 &&
            y <= 250 + 30 &&
            y + 50 >= 250 ) {

            System.out.println("hit");

            fill(46, 102, 232);
        }
        else {
            fill(133, 191, 230);
        }

        rect(250, 250, 30, 30);
    }


}
