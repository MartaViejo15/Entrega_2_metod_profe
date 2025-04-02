package Ejercicio_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContraseñaTest {


    @Test
    void contraseña() {
        assertThrows(ContraseñaExcepción.class, () -> Contraseña.contraseña("asdawsawd"));
        assertDoesNotThrow(() -> Contraseña.contraseña("9876matecompu"));
    }

    @Test
    void main() {
        assertDoesNotThrow(() -> Contraseña.main(null));
    }
}