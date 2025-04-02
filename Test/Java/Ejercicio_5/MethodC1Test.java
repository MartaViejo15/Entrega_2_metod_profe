package Ejercicio_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodC1Test {

    @Test
    void main() {
        assertThrows(XxxException.class, () -> MethodC1.main(null));
        assertThrows(YyyException.class, () -> MethodC1.main(null));
    }

    @Test
    void methodC() {
        assertDoesNotThrow(() -> MethodC1.main(null));
    }

    @Test
    void methodD() {
        assertDoesNotThrow(()-> MethodC1.main(null));
    }
}