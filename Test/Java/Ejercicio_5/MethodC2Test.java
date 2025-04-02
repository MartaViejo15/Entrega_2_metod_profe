package Ejercicio_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodC2Test {

    @Test
    void main() {
        assertThrows(XxxException.class, () -> MethodC2.main(null));
        assertThrows(YyyException.class, () -> MethodC2.main(null));
    }

    @Test
    void methodC() {
        assertDoesNotThrow(()-> MethodC2.main(null));
    }

    @Test
    void methodD() {
        assertDoesNotThrow(()-> MethodC2.main(null));
    }
}