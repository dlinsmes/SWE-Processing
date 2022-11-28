import processing.core.PApplet;
import processing.core.PImage;

public class Potato {

    PApplet p;
    float x;
    float y;
    int w;
    int h;
    float speed;
    PImage tater;

    //one param needs to be PApplet
    public Potato(float x, float y, PApplet p) {
        this.x = x;
        this.y = y;
        this.p = p; //important
        w = (int)(Math.random()*100 + 50);
        h = (int)(Math.random()*100 + 50);
        speed = (int)(Math.random()*10 + 2);

        tater = p.loadImage("potato.png");
        tater.resize(w, h);
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
        p.image(tater, x, y);
    }



}
