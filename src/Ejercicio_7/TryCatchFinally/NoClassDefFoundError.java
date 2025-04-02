package Ejercicio_7.TryCatchFinally;

public class NoClassDefFoundError {
    public static void main(String[] args) {
        String ClaseInexistente = "ClaseInexistente";

       try {
           Object o = Class.forName(ClaseInexistente).newInstance();
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
       } finally {
           System.out.println("ClaseInexistente check");
       }
    }
}
