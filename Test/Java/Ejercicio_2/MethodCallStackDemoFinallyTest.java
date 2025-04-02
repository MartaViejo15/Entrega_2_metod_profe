package Ejercicio_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MethodCallStackDemoFinallyTest {


    @Test
    void methodA() {
        assertDoesNotThrow(() -> MethodCallStackDemoFinally.methodA());
    }

    @Test
    void methodB() {
        assertDoesNotThrow(() -> MethodCallStackDemoFinally.methodB());
    }

    @Test
    void methodC() {
        assertDoesNotThrow(() -> MethodCallStackDemoFinally.methodC());
    }

    @Test
    void main() {
        assertDoesNotThrow(() -> MethodCallStackDemoFinally.main(null));
    }

}