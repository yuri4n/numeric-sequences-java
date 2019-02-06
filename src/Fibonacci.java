import processing.core.PApplet;

public class Fibonacci extends Sequence {

    Fibonacci(PApplet parent) {
        super(parent);
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

    @Override
    void display(float term) {
        float x = (parent.height/compute(term))-25;
        float r = parent.random(255);
        float g = parent.random(255);
        float b = parent.random(255);

        parent.stroke(245,246,250);
        parent.strokeWeight(5);

        parent.translate((parent.width/2)+2*x, (parent.height/2)+x);
        parent.fill(r,g,b);
        parent.rect(0, 0, x*compute(2), x*compute(2));

        r = parent.random(255);
        g = parent.random(255);
        b = parent.random(255);
        parent.translate(-x*compute(2), 0);
        parent.fill(r,g,b);
        parent.rect(0, 0, x*compute(3), x*compute(3));

        r = parent.random(255);
        g = parent.random(255);
        b = parent.random(255);
        parent.translate(0, x*compute(3));
        parent.fill(r,g,b);
        parent.rect(0, 0, x*compute(4), x*compute(4));

        r = parent.random(255);
        g = parent.random(255);
        b = parent.random(255);
        parent.translate(x*compute(4), -x*compute(3));
        parent.fill(r,g,b);
        parent.rect(0, 0, x*compute(5), x*compute(5));

        r = parent.random(255);
        g = parent.random(255);
        b = parent.random(255);
        parent.translate(-x*compute(4), -x*compute(6));
        parent.fill(r,g,b);
        parent.rect(0, 0, x*compute(6), x*compute(6));

        r = parent.random(255);
        g = parent.random(255);
        b = parent.random(255);
        parent.translate(-x*compute(7), 0);
        parent.fill(r,g,b);
        parent.rect(0, 0, x*compute(7), x*compute(7));
    }
}
