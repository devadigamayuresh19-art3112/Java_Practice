<<<<<<< HEAD:Functions/problem_01.java
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
=======
package Functions;
import java.util.*;
public class problem_01 {
    public static void prime (int a){
        int count=0;
        for (int i=1;i<=a;i++){
            if (a%i==0){
                count+=1;
            }
        }
        if (count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not prime");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter A Number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        prime(num);
        sc.close();
}
    }
    
>>>>>>> a34cafb (New Problem Solve):Java_practice/Functions/problem_01.java
