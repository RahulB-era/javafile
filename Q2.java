// WAP to demonstrate the use of arithmetic and bitwise operators.
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter two numbers:");

        int num1 = myObj.nextInt(); 
        int num2 = myObj.nextInt(); 

        // Arithmetic operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        // Bitwise operators
        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
        System.out.println("Bitwise NOT (num1): " + (~num1));
        System.out.println("Left Shift (num1 << 1): " + (num1 << 1));
        System.out.println("Right Shift (num1 >> 1): " + (num1 >> 1));
    }
}
   