package Ejercicio_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ScannerFromFileWithCatchTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> ScannerFromFileWithCatch.main(null));
    }
}