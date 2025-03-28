package Ejercicio_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ScannerFromFileWithThrowTest {

    @Test
    void main() {
        assertThrows(java.io.FileNotFoundException.class, () -> ScannerFromFileWithThrow.main(null));
    }
}