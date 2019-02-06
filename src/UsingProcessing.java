import processing.core.PApplet;

public class UsingProcessing extends PApplet {
    int n;
    Fibonacci sFibo = new Fibonacci(this);

    public static void main(String[] args) {
        PApplet.main("UsingProcessing");
    }

    public void settings() {
        size(1137, 640);
    }

    public void setup() {
        background(255, 0, 0);
        n = 7;
    }

    public void draw() {
        sFibo.compute(n);
    }

    public void mouseReleased() {
        sFibo.display(n);
    }
}

