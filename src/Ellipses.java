import processing.core.PApplet;

public class Ellipses {
    PApplet parent;

    Ellipses(PApplet parent) {
        this.parent = parent;
    }

    void display() {
        parent.ellipse(parent.frameCount, 50, 100, 100);
    }
}
