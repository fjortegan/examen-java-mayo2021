package es.iesrafaelalberti.daw.prog.examen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraficoCompuestoTest {
    Circulo miCirculo;
    Rectangulo miRectangulo;
    Punto miPunto;
    GraficoCompuesto miGraficoCompuesto;

    @BeforeEach
    void preparacion() throws OutOfScreenException {
        miCirculo = new Circulo(50, 50, 30);
        miPunto = new Punto(10,10);
        miRectangulo = new Rectangulo(50, 50, 30, 60);
        miGraficoCompuesto = new GraficoCompuesto();
        miGraficoCompuesto.annadirGrafico(miCirculo);
        miGraficoCompuesto.annadirGrafico(miPunto);
        miGraficoCompuesto.annadirGrafico(miRectangulo);
    }

    @Test
    void moverTest() {
        assert  miGraficoCompuesto.mover(-11, 0) == false;
        miGraficoCompuesto.dibujar();
    }

    @Test
    void dibujarTest() {
        miGraficoCompuesto.dibujar();
    }


}