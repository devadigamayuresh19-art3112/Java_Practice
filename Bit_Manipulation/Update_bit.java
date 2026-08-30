//Update Bit:
package Bit_Manipulation;

import java.util.Scanner;

public class Update_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt= sc.nextInt();
        int n= 5; //0101
        int post=2;
        int Bitmask= 1<<post;
        if(opt==1){
            int newnum=Bitmask | n;
            System.out.println(newnum);
        }
        else{
            int num1= ~(Bitmask) & n;
            System.out.println(num1);
        }
        sc.close();

    }
}
