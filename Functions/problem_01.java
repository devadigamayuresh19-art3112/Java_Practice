// Program to print multiplication of two numbers using a function
package Functions;

import java.util.Scanner;

public class problem_01 {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println("Enter Two Numbers:");

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Multiplication of " + num1 + " and " + num2
                + " is " + multiply(num1, num2));

        sc.close();
    }
}