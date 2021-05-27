package es.iesrafaelalberti.daw.prog.examen;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PuntoTest {
    Punto miPunto;

    @BeforeEach
    void preparacion() throws OutOfScreenException {
        miPunto = new Punto(10,10);
    }

    @org.junit.jupiter.api.Test
    void mover() {
        assert miPunto.mover(20,20) == true;
        assert miPunto.getX() == 30;
        assert miPunto.getY() == 30;
        assert miPunto.mover(1000, 0) == false;
    }

    @org.junit.jupiter.api.Test
    void dibujar() {
        miPunto.dibujar();
    }

    @Test
    void constructor() {
        assertThrows(OutOfScreenException.class, () -> new Punto(801, 0));
    }
}