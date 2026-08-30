//Write a program to find if a number is a power of 2 or not
package Bit_Manipulation;

import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter A Number:");
        int n= sc.nextInt();
        int result= n & n-1;
        if( result==0){
          System.out.println("Number is power of 2 ");
        }
        else{
            System.out.println("Number is not power of 2");
        }
    sc.close();
    }
}
