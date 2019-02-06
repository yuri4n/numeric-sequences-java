import processing.core.PApplet;

public class UsingProcessing extends PApplet {
    Ellipses e = new Ellipses(this);

    public static void main(String[] args) {
        PApplet.main("UsingProcessing");
    }

    public void settings() {
        size(1137, 640);
    }

    public void setup() {
        background(255, 0, 0);
        ellipseMode(CENTER);
        ellipse(height / 2, width / 2, 50, 50);
    }

    public void draw() {
        e.display();
    }
}

