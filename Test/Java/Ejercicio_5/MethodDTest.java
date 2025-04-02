package Ejercicio_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodDTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> MethodD.main(null));
    }

    @Test
    void methodD() {
        assertThrows(XxxException.class, () -> MethodD.methodD(7));
        assertThrows(YyyException.class, () -> MethodD.methodD(-10));

    }
}