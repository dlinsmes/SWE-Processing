import processing.core.PApplet;
public class ObjectDemo extends PApplet{

    public static void main(String [] args) {
        PApplet.main("ObjectDemo");
    }

    public void settings() {
        size(500, 500);
    }

    Car c1;
    Car c2;

    Potato tater1;
    Potato tater2;

    public void setup(){
        //pass "this" keyword for PApplet parameter
        c1 = new Car(10, 250, 80, 50, 8, this);

        c2 = new Car(50, 400, 200, 75, -3, this);

        tater1 = new Potato(80, 50, this);
        tater2 = new Potato(100, 300, this);
    }

    public void draw() {
        background(100);

        //call methods from Car object
        c1.move();
        c1.display();

        c2.move();
        c2.display();

        tater1.move();
        tater1.display();

        tater2.move();
        tater2.display();
    }

}
