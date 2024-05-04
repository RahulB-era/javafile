// WAP to demonstrate the concept of user defined exceptions.


// Custom exceptions are useful when you want to create exceptions specific to your application's logic or when you want to catch and handle a subset of existing exceptions differently.

// A Class that represents use-defined exception
class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
public class Q19 {
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("message that is shown by .getMessage()");
        }
        catch (MyException ex) {
            System.out.println("Caught");
 
            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}