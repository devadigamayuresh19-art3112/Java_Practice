//Write a program to count the number of 1’s in a binary representation of the number
package Bit_Manipulation;

import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        int count=0;
        int temp =n;
        while (temp!=0){
              if((temp & 1)==1){
                count++;
              }
              temp=temp>>1;
        }
        System.out.println("Number of 1's in a binary representation is "+ count);
    }
}
