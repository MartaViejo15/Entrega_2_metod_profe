package Ejercicio_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        try { // main logic
            System.out.println("Start of the main logic");
            System.out.println("Try opening a file ...");
            Scanner in = new Scanner(new File("test.in"));
            System.out.println("File Found, processing the file ...");
            System.out.println("End of the main logic");
            Scanner sc = new Scanner(new File("null"));
        } catch (FileNotFoundException ex) { // error handling separated from the main logic
            System.out.println("File Not Found caught ...");
        } finally { // always run regardless of exception status
            System.out.println("finally-block runs regardless of the state of exception");
        }
        // after the try-catch-finally
        System.out.println("After try-catch-finally, life goes on...");
    }

}
