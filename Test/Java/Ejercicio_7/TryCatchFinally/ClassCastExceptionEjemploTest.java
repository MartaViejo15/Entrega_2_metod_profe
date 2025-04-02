package Ejercicio_7.TryCatchFinally;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassCastExceptionEjemploTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> ClassCastExceptionEjemplo.main(null));
    }
}