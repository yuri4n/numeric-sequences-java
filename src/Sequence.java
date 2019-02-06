import processing.core.PApplet;

abstract class Sequence {
    PApplet parent;
    int n;

    Sequence(PApplet parent) {
        this.parent = parent;
    }

    abstract float compute(float n);

    void display(float termino) {
        float ancho = (width - 50) / (termino);
        float alto = (height - 50) / (compute(termino) + 1);
        strokeWeight(2);
        stroke(44, 62, 80);

        for (float i = 50; i < width; i = i + ancho) {
            line(i, 0, i, height - 50);
        }
        for (float i = alto; i <= height - 50; i = i + alto) {
            line(50, i, width, i);
        }
    }

    void display() {
        display(n);
    }

    void puntos(float termino) {
        float ancho = (width - 50) / (termino);
        float alto = (height - 50) / (compute(termino) + 1);
        strokeWeight(15);
        stroke(192, 57, 43);
        for (float i = termino; i > 0; i--) {
            point(((i * ancho) + 50) - ancho, (height - (compute(i) * alto)) - 50);
        }
    }

    void puntos() {
        puntos(n);
    }
}
