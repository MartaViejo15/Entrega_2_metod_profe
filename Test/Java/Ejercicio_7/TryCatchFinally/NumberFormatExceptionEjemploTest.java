package Ejercicio_7.TryCatchFinally;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberFormatExceptionEjemploTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> NumberFormatExceptionEjemplo.main(null));
    }
}