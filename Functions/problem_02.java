<<<<<<< HEAD:Functions/problem_02.java
//Program to calculate Factorial of a NUmber :

import java.util.*;
public class problem_02 {
    public static int fact(int a){
        int fact=1;
        for (int i=1;i<=a;i++){
            fact*=i;

        }
        return fact;

    }
    public static void main(String[] args) {
        System.out.println("Enter A Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Factorial of " + num + "is" + fact(num));
    }
=======
package Functions;

import java.util.Scanner;

public class problem_02 {
    public static void even(int a){
        if(a==0){
            System.out.println("Zero Number");
        }
        else if (a%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter A Number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        even(num);
        sc.close();
}
>>>>>>> a34cafb (New Problem Solve):Java_practice/Functions/problem_02.java
}
