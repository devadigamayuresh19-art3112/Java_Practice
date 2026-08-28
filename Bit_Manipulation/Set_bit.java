//Set Bit:
package Bit_Manipulation;

public class Set_bit {
    public static void main(String[] args) {
        int n=5; //0101
        int post=3;
        int Bitmask= 1<<post;
        int newnum= Bitmask | n;
        System.out.println(newnum);
    }
}
