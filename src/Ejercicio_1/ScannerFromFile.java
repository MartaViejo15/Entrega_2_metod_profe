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
        }
        /* Esto lo que hace es escribir la excepcion en la terminal sin que de el error
           en rojo */
    }
}
