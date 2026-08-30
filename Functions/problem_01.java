package Functions;
import java.util.Scanner;

public class problem_01 {

    // Function to calculate product of two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Calling the function
        double result = multiply(a, b);

        System.out.println("Product of " + a + " and " + b + " is: " + result);

        sc.close();
    }
}