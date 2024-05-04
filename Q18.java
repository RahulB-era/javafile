// Write a program to demonstrate unchecked exception.

// Unchecked Exceptions:
// Unchecked exceptions (also known as runtime exceptions) occur due to errors within the program logic itself. These exceptions are not verified by the compiler at compile-time.
// Examples of unchecked exceptions include ArithmeticException, NullPointerException, and ArrayIndexOutOfBoundsException.
// We don’t need to declare unchecked exceptions using the throws keyword.



public class Q18 {

    public static void divideByZero() {
        int numerator = 1;
        int denominator = 0;
        try {
            int result = numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Trying to divide by zero");
        }
    }

    public static void main(String[] args) {
        Q18.divideByZero();

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Trying to access an element at index 5, which is out of bounds
            int number = numbers[5];
            System.out.println("Number at index 5: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }
    }
}
