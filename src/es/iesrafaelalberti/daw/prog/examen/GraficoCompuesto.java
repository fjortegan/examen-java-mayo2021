package es.iesrafaelalberti.daw.prog.examen;

import java.util.ArrayList;
import java.util.List;

public class GraficoCompuesto implements Grafico {
    List<Grafico> hijos;

    GraficoCompuesto() {
        hijos = new ArrayList<>();
    }

    public void annadirGrafico(Grafico hijo) {
        hijos.add(hijo);
    }

    public boolean quitarGrafico(Grafico hijo) {
        return hijos.remove(hijo);
    }

    @Override
    public boolean mover(int x, int y) {
        boolean dentroPantalla = true;
        for(Grafico hijo: hijos) {
            if (!hijo.mover(x, y)) dentroPantalla = false;
        }
        return dentroPantalla;
    }

    @Override
    public void dibujar() {
        System.out.println("Grafico compuesto: ");
        for(Grafico hijo: hijos) {
            hijo.dibujar();
        }
    }
}
