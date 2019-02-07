import processing.core.PApplet;

abstract class Sequence {
    PApplet parent;
    int n;

    Sequence(PApplet parent, int n) {
        this.parent = parent;
        this.n = n;
    }

    abstract float compute(float n);

    void display(float termino) {
        float ancho = (parent.width - 50) / (termino);
        float alto = (parent.height - 50) / (compute(termino) + 1);
        parent.stroke(44, 62, 80);
        parent.strokeWeight(2);

        for (float i = 50; i < parent.width; i = i + ancho) {
            parent.line(i, 0, i, parent.height - 50);
        }
        for (float i = alto; i <= parent.height - 50; i = i + alto) {
            parent.line(50, i, parent.width, i);
        }
    }

    void display() {
        display(n);
    }

    void puntos(float termino) {
        float ancho = (parent.width - 50) / (termino);
        float alto = (parent.height - 50) / (compute(termino) + 1);
        parent.strokeWeight(15);
        parent.stroke(192, 57, 43);
        for (float i = termino; i > 0; i--) {
            parent.point(((i * ancho) + 50) - ancho, (parent.height - (compute(i) * alto)) - 50);
        }
    }

    void puntos() {
        puntos(n);
    }
}
