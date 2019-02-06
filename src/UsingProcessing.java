import processing.core.PApplet;

public class UsingProcessing extends PApplet {
    int n;
    Sequence sequence;

    public static void main(String[] args) {
        PApplet.main("UsingProcessing");
    }

    public void settings() {
        size(1137, 640);
    }

    public void setup() {
        background(53,59,72);
        n = 7;
        sequence = new Fibonacci(this);
    }

    public void draw() {
        sequence.compute(n);
    }

    public void mouseReleased() {
        sequence.display(n);
    }
}

