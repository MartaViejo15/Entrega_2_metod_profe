package Ejercicio_5;

public class MethodD {
    public static void main(String[] args) throws XxxException, YyyException {
        try {
            // uses methodD() which declares XxxException & YyyException
            methodD(7);
        } catch (XxxException ex) {
            // Exception handler for XxxException
            System.out.println("XxxException: " + ex.getMessage());
        } catch (YyyException ex) {
            // Exception handler for YyyException
        } finally { // optional
            // These codes always run, used for cleaning up
            System.out.println("Finally del methodC()");
        }
        try {
            // uses methodD() which declares XxxException & YyyException
            methodD(4);
            methodD(-2);
        } catch (XxxException ex) {
            // Exception handler for XxxException
        } catch (YyyException ex) {
            // Exception handler for YyyException
            System.out.println("YyyException: " + ex.getMessage());
        } finally { // optional
            // These codes always run, used for cleaning up
            System.out.println("Finally del methodC()");
        }
    }

    public static void methodD(int value) throws XxxException, YyyException { // method's signature

        // XxxException occurs
        if (value > 5) {
            throw new XxxException("Error: Valor demasiado grande (" + value + ")"); // construct an XxxException object and throw to JVM
        }
        // YyyException occurs
        if (value < 0){
            throw new YyyException("Error: Valor negativo no permitido (" + value + ")"); // construct an YyyException object and throw to JVM
        }
        System.out.println("El valor" + value + "es válido");
    }

}
