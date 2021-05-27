package es.iesrafaelalberti.daw.prog.examen;

public class Circulo extends Punto {
    private int radio;

    Circulo(int x, int y, int radio) throws OutOfScreenException {
        super(x, y);
        this.radio = radio;
        if (fueraPantalla()) throw new OutOfScreenException();

    }

    @Override
    protected boolean fueraPantalla() {
        return this.x - this.radio < 0 || this.y - this.radio < 0 ||
               this.x + this.radio >= 800 || this.y + this.radio >= 600;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo: (" + x + ", " + y + ") Radio: " + radio;
    }
}
