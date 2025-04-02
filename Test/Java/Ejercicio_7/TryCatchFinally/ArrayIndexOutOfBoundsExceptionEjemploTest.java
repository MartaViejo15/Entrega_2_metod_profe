package Ejercicio_7.TryCatchFinally;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIndexOutOfBoundsExceptionEjemploTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> ArrayIndexOutOfBoundsExceptionEjemplo.main(null));
    }
}