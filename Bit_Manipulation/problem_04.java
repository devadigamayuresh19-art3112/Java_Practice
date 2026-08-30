//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.
package Bit_Manipulation;

import java.util.Scanner;

public class problem_04 {
    public static void decimalToBinary(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A Number:");
        int n= sc.nextInt();
        int [] remainder = new int[32];
        int dividend =n;
        int i=0;
        while(dividend >0) {
            remainder[i]=dividend%2;
            dividend=dividend/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(remainder[j]+" ");
        }
        System.out.println();
    }
    public static void binaryToDecimal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Binary Number:");
        int size = sc.nextInt();
        int[] binary = new int[size];
        int decimal = 0;

        System.out.println("Enter binary digits (left-to-right):");
        for (int i = 0; i < size; i++) {
            binary[i] = sc.nextInt();
            // Power counts down from (size - 1) for the leftmost bit to 0 for the rightmost bit
            int power = size - 1 - i;
            decimal += binary[i] * (int) Math.pow(2, power);
        }
        System.out.println("Decimal: " + decimal);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int choice=0;
       while(choice!=3){
        System.out.printf("Enter a Choice:%n1.Decimal To Binary%n2.Binary To Decimal%n3.Exit%n");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                decimalToBinary();
                
                break;
            case 2:
                binaryToDecimal();
                
                break;
            case 3:
                
                break;
        
            default:
                System.out.println("Enter Valid Choice:");
                break;
        }
       }
        
    }
}
