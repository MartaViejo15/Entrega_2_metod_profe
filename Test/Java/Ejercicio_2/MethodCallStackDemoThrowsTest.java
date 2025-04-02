package Ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MethodCallStackDemoThrowsTest {

    @org.junit.jupiter.api.Test
    void main() {
        assertDoesNotThrow(() -> MethodCallStackDemoThrows.main(new String[0]));
    }

    @org.junit.jupiter.api.Test
    void methodA() {
        assertDoesNotThrow(MethodCallStackDemoThrows::methodA);
    }

    @org.junit.jupiter.api.Test
    void methodB() {
        assertDoesNotThrow(MethodCallStackDemoThrows::methodB);
    }

    @org.junit.jupiter.api.Test
    void methodC() {
        assertThrows(ArithmeticException.class, () -> MethodCallStackDemoThrows.methodC(true));
        assertDoesNotThrow(() -> MethodCallStackDemoThrows.methodC(false));
    }
}