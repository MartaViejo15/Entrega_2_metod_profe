package Ejercicio_7.TryCatchFinally;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoClassDefFoundErrorTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> NoClassDefFoundError.main(null));
    }
}