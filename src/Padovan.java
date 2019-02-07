import processing.core.PApplet;

public class Padovan extends Sequence{
    PApplet parent;

    public Padovan(PApplet parent, int n) {
        super(parent, n);
    }

    @Override
    public float compute(float n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 1;
        if(n == 3)
            return 1;
        if(n > 3)
            return compute(n-2) + compute(n-3);
        return -1;
    }
}
