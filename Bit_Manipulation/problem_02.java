//​ Write a program to toggle a bit a position = “pos” in a number “n”.
package Bit_Manipulation;

import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        int n=sc.nextInt();
        System.out.println("Enter postion of shift");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int newnum= ~(bitmask) & n;
        System.out.println(newnum);
    }
}
