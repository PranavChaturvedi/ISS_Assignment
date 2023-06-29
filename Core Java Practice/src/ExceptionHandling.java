import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // the code  below will give an NumberFormatException(Runtime error)
        // if the input entered is a not an integer
        //int x = Integer.parseInt(sc.nextLine());
        //System.out.println(x);

        // the line below gives an InputMismatchException if the input entered is not an integer
        try {
            int x = sc.nextInt();
            System.out.println("Try block");
        }
        catch(InputMismatchException e){
            System.out.println("Exception caught by catch block");
        }
        finally {
            System.out.println("Finally block executed");
        }

        /*
        If the input is an integer
        O/P - Try block
              Finally block executed

        If the input is not an integer
        O/P - Exception caught by catch block
              Finally block executed
        * */

        //throw keyword is used to transfer control from the try block to the catch block.

        try{
            System.out.println("An exception is about to be thrown");
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e){
            System.out.println("Catch block executed");
        }

        /*throws keyword is used in method signature to inform the caller about the exception that
        * might occur.
        * It makes sure that the responsibilty of handling the exception belong to the caller
        * */
        try {
            System.out.println("function() about to be called");
            function();
        }
        catch (Exception e){
            System.out.println("Catch block executed");
        }

    }
    public static void function() throws NoSuchMethodException {
        System.out.println("Inside function()");
        throw new NoSuchMethodException();
    }
}
