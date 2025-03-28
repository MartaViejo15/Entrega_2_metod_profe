package Ejercicio_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ScannerFromFile {
    public static void main(String[] args) {
        /* Scanner in = new Scanner(new File("test.in"));
           Solo poniendo esto, va a dar error en new Scanner porque no se trata la excepcion de que
           el archivo no está
         */
        try{
            Scanner in = new Scanner(new File("test.in"));
        }catch (FileNotFoundException e){
            System.out.println(e);
            /* Esto lo que hace es escribir la excepción en la terminal sin que dé el error
           en rojo */
        } finally {
        System.out.println("Scanner finished");
        }

        /* Al usar un try-catch le pedimos que pruebe lo del try y en caso de dar error
        que imprima por pantalla el FileNotFoundException, que es lo que dice el catch,
        y al añadirle un finally le decimos que siempre imprima el string "Scanner finished",
        se dé o no la excepción.
         */

    }
}
