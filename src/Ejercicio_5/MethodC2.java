package Ejercicio_5;

public class MethodC2 {
    public static void main(String[] args) throws XxxException, YyyException {
        MethodC2 m2 = new MethodC2();
        m2.methodC();
    }
    public void methodC() throws XxxException, YyyException {
        System.out.println("Enter methodC()");
        try {
            // uses methodD() which declares XxxException & YyyException
            methodD(7);

        } catch (XxxException ex) {
            // Exception handler for XxxException
            System.out.println("XxxException: " + ex.getMessage());
        } catch (YyyException ex) {
            // Exception handler for YyyException
            System.out.println("YyyException: " + ex.getMessage());
        } finally { // optional
            // These codes always run, used for cleaning up
            System.out.println("Finally del methodC()");
        }

        try {
            // uses methodD() which declares XxxException & YyyException
            methodD(3);
            methodD(-1);
        } catch (XxxException ex) {
            // Exception handler for XxxException
            System.out.println("XxxException: " + ex.getMessage());
        } catch (YyyException ex) {
            // Exception handler for YyyException
            System.out.println("YyyException: " + ex.getMessage());
        } finally { // optional
            // These codes always run, used for cleaning up
            System.out.println("Finally del methodC()");
        }
        System.out.println("Exit methodC()");
    }
    public void methodD(int value) throws XxxException, YyyException { // method's signature
        // method's body
        System.out.println("Enter methodD() with value: " + value);

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
