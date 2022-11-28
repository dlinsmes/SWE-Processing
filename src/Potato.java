import processing.core.PApplet;
import processing.core.PImage;

public class Potato {

    PApplet p;
    float x;
    float y;
    int w;
    float speed;

    PImage tater;

    //one param needs to be PApplet
    public Potato(float x, float y, PApplet p) {
        this.x = x;
        this.y = y;
        w = (int)(Math.random()*100 + 50);
        speed = (int)(Math.random()*5 + 2);

        this.p = p; //important

        tater = p.loadImage("potato.png");
        tater.resize(w, 0);
    }

    public void move(){
        x += speed;
        //use system variable width from Processing window
        if (x >= p.width) {
            x = -w;
        }
        else if (x+w <= 0) {
            x = p.width;
        }
    }

    public void display() {
        //draw shapes on processing window
        p.image(tater, x, y);

        //can also load an image to display
    }



}
