package Ejercicio_7.TryCatchFinally;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IllegalArgumentExceptionEjemploTest {

    @Test
    void raizCuadrada() {
        assertThrows(IllegalArgumentException.class, () -> IllegalArgumentExceptionEjemplo.raizCuadrada(-8));
        assertDoesNotThrow(() -> IllegalArgumentExceptionEjemplo.raizCuadrada(4));
    }

    @Test
    void main() {
        assertDoesNotThrow(() -> IllegalArgumentExceptionEjemplo.main(null));
    }
}