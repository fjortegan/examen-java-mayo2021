package es.iesrafaelalberti.daw.prog.examen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    Circulo miCirculo;

    @BeforeEach
    void preapacion() throws OutOfScreenException {
        miCirculo = new Circulo(50, 50, 30);
    }

    @Test
    void moverTest() {
        assert miCirculo.mover(50, 50) == true;
        assert miCirculo.getX() == 100;
        assert miCirculo.getY() == 100;
        assert miCirculo.mover(-80, 0) == false;
    }

    @Test
    void dibujarTest() {
        miCirculo.dibujar();
    }

    @Test
    void constructor() {
        assertThrows(OutOfScreenException.class, () -> new Circulo(10, 10, 30));
    }

}