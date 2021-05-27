package es.iesrafaelalberti.daw.prog.examen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {
    Rectangulo miRectangulo;

    @BeforeEach
    void preparacion() throws OutOfScreenException {
        miRectangulo = new Rectangulo(50, 50, 30, 60);
    }

    @Test
    void moverTest() {
        assert miRectangulo.mover(50, 50) == true;
        assert miRectangulo.getX() == 100;
        assert miRectangulo.getY() == 100;
        assert miRectangulo.mover(670, 0) == false;
    }

    @Test
    void dibujarTest() {
        miRectangulo.dibujar();
    }

    @Test
    void constructor() {
        assertThrows(OutOfScreenException.class, () -> new Rectangulo(780, 10, 30, 60));
    }
}