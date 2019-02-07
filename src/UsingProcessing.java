import processing.core.PApplet;

public class UsingProcessing extends PApplet {
    int n;
    Sequence sequence;
    boolean padovan;

    public static void main(String[] args) {
        PApplet.main("UsingProcessing");
    }

    public void settings() {
        size(1137, 640);
    }

    public void setup() {
        n = 7;
        sequence = new Fibonacci(this, n);
    }

    public void draw() {
        background(224, 224, 224);
        sequence.compute(n);
        sequence.display(n);
        sequence.puntos(n);
    }

    public void mouseReleased() {
        padovan = !padovan;
        sequence = padovan ? new Padovan(this, n) : new Fibonacci(this, n);
    }
}