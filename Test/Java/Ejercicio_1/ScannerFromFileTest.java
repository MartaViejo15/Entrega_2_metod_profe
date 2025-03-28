package Ejercicio_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ScannerFromFileTest {

    @Test
    void main() {
        assertDoesNotThrow(()-> ScannerFromFile.main(null));
    }
}