package Ejercicio_7.TryCatchFinally;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NullPointerExceptionEjemploTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> NullPointerExceptionEjemplo.main(null));
    }
}