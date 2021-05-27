package es.iesrafaelalberti.daw.prog.examen;

public class Punto implements Grafico {
    protected int x;
    protected int y;

    public Punto(int x, int y) throws OutOfScreenException {
        this.x = x;
        this.y = y;
        if (fueraPantalla()) throw new OutOfScreenException();
    }

    @Override
    public boolean mover(int x, int y) {
        this.x += x;
        this.y += y;
        return !fueraPantalla();
    }

    protected boolean fueraPantalla() {
        return this.x < 0 || this.y < 0 || this.x >= 800 || this.y >= 600;
    }

    @Override
    public void dibujar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Punto: (" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
