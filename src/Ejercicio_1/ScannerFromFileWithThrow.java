package Ejercicio_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFromFileWithThrow {
    public static void main(String[] args) throws FileNotFoundException {
// to be handled by next higher-level method
        Scanner in = new Scanner(new File("test.in"));
// this method may throw FileNotFoundException
// main logic here ...
        /* El throws lo que hace es que cuando da la excepción indicada lanza el error
           para que se solucione en la parte de arriba de la pila de llamadas, asi el
           programador no maneja el error, y en la terminal puede dar error, que el
           programador no trata */
    }
}