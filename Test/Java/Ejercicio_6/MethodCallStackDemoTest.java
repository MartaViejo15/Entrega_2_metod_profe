package Ejercicio_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodCallStackDemoTest {

    @Test
    void main() {
        assertThrows(ArithmeticException.class, () -> MethodCallStackDemo.main(null));
    }

    @Test
    void methodA() {
        assertThrows(ArithmeticException.class, () -> MethodCallStackDemo.methodA());
    }
}