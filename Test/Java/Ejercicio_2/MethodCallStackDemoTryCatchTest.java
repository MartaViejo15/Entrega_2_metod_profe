package Ejercicio_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodCallStackDemoTryCatchTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> MethodCallStackDemoTryCatch.main(null));
    }

    @Test
    void methodA() {
        assertDoesNotThrow(() -> MethodCallStackDemoTryCatch.methodA());
    }

    @Test
    void methodB() {
        assertDoesNotThrow(() -> MethodCallStackDemoTryCatch.methodB());
    }

    @Test
    void methodC() {
        assertDoesNotThrow(() -> MethodCallStackDemoTryCatch.methodC());
    }
}