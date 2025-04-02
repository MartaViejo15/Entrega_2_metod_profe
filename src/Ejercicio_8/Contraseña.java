package Ejercicio_8;

public class Contraseña {
    public static void Contraseña(String contra) throws ContraseñaExcepción {
        if (contra != "9876matecompu#") {
            throw (new ContraseñaExcepción(contra));
        }
    }

    public static void main(String[] args) {
        try {
            Contraseña("9876matecompu#");
            Contraseña("Hola Antonio!");
        } catch (ContraseñaExcepción ex) {
            System.out.println("ContraseñaExcepción encontrada: " + ex.getMessage());
        } finally {
            System.out.println("¡Enhorabuena!¡Has sabido escribir una contraseña!");
        }
    }
}
