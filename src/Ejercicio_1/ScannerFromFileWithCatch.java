package Ejercicio_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFromFileWithCatch {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
// do something if no exception ...
// you main logic here in the try-block
        } catch (FileNotFoundException ex) { // error handling separated from the main logic
            ex.printStackTrace(); // print the stack trace
        }
        /* El printStackTrace lo que hace es imprimir la pila de llamadas al metodo para
           poder saber como se ha depurado el código e ir realizando operaciones de limpieza */
    }
}

