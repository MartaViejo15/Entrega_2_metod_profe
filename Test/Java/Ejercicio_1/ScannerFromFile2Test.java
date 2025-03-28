package Ejercicio_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ScannerFromFile2Test {

    @Test
    void main() {
        assertThrows(java.io.FileNotFoundException.class, () -> ScannerFromFile2.main(null));
    }
}