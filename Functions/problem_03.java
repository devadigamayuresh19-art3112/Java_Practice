<<<<<<< HEAD:Functions/problem_03.java
//Program to check number is prime or not using functions:
import java.util.*;
public class problem_03 {
    public static void prime(int a){
           int count=0;
           for (int i=1;i<=a;i++){
            if(a%i==0){
                count+=1;
            }
           }
           if(count==2){
            System.out.println("Number is Prime");
           }
           else{
            System.out.println("Number is Not Prime");
           }
    }
    public static void main(String[] args) {
        System.out.println("Enter A Number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        prime(num);
    }
=======
package Functions;

import java.util.Scanner;

public class problem_03 {
    public static void table(int a){
        for (int i=1;i<=10;i++){
            System.out.println(a +" "+ "X" +" " + i + " "+"=" +" "+ a*i);
        }
    }
     public static void main(String[] args) {
        System.out.println("Enter A Number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        table(num);
        sc.close();
}
>>>>>>> a34cafb (New Problem Solve):Java_practice/Functions/problem_03.java
}
