package Ejercicio_7.TryCatchFinally;

public class NumberFormatExceptionEjemplo {
    public static void main(String[] args) {
        String numeroNoValido = "abc";

        try {
            int numero = Integer.parseInt(numeroNoValido);
            //System.out.println("Número convertido: " + numero); No sale porque da la excepcion
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException encontrada: " + ex.getMessage());
        } finally {
            System.out.println("Final del try");
        }
    }
}
