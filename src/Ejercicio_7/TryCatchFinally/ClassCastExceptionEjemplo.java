package Ejercicio_7.TryCatchFinally;

public class ClassCastExceptionEjemplo {
    public static void main(String[] args) {
        Object o = new Object();

        try {
            Integer i = (Integer) o;
        } catch (ClassCastException ex) {
            System.out.println("ClassCastException encontrada: " + ex);
        } finally {
            System.out.println("Fin del try");
        }
    }
}
