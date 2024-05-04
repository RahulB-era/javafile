
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        try {
// try-catch block to check if the salary is less than 85,000. If it is,
            if (salary < 85000) {
// we throw an ArithmeticException with the message "Not eligible for loan".
                throw new ArithmeticException("Not eligible for loan");
            } else {
//If the salary is greater than or equal to 85,000, we print a message congratulating the person.
                System.out.println("Congratulations, " + name + "! You are eligible for the loan.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Sorry, " + name + ". " + e.getMessage());
        }
    }
}


// ArithmeticException is a class in Java that extends the RuntimeException class. It is used to indicate that an arithmetic operation has failed or is not possible. Some common scenarios where an ArithmeticException may occur like division by 0