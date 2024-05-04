// WAP to calculate first n Fibonacci numbers and store in an array.
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = obj.nextInt();
        int fibonacci[] = new int[n];
        int j = 0;

        if (n <= 0) {
            System.out.println("Enter a valid number");
        } else {
            for (j = 0; j < n; j++) {
                if (j == 0) {
                    fibonacci[j] = 0;
                } else if (j == 1) {
                    fibonacci[j] = 1;
                } else {
                    fibonacci[j] = fibonacci[j - 1] + fibonacci[j - 2];
                }
            }

            for (int i = 0; i < j; i++) {
                System.out.println(fibonacci[i]);
            }
        }
    }
}
