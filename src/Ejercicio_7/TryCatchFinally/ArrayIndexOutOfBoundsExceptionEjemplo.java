package Ejercicio_7.TryCatchFinally;

public class ArrayIndexOutOfBoundsExceptionEjemplo {
    public static void main(String[] args) {
        int[] anArray = new int[3];

        try {
            System.out.println("Valor en anArray[3]: " + anArray[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Valor incorrecto: " + ex.getMessage());
        } finally {
            System.out.println("Try finalizado");
        }
    }
}
