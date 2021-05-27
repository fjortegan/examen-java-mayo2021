package es.iesrafaelalberti.daw.prog.examen;

public class Rectangulo extends Punto {
    private int ancho;
    private int alto;

    Rectangulo(int x, int y, int ancho, int alto) throws OutOfScreenException {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
        if (fueraPantalla() || ancho < 0 || alto < 0) throw new OutOfScreenException();
    }

    @Override
    protected boolean fueraPantalla() {
        return this.x < 0 || this.y < 0 ||
                this.x + this.ancho >= 800 || this.y + this.alto >= 600;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangulo: (" + x + ", " + y + ") Ancho: " + ancho + " Alto: " + alto;
    }
}
