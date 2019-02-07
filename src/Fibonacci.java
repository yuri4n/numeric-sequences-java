import processing.core.PApplet;

public class Fibonacci extends Sequence {

    Fibonacci(PApplet parent, int n) {
        super(parent, n);
    }

    @Override
    float compute(float n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (n > 2)
            return compute(n - 2) + compute(n - 1);
        return -1;
    }
}
