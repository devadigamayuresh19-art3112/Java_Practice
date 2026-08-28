//Clear Bit:
package Bit_Manipulation;

public class Clear_bit {
    public static void main(String[] args) {
        int n=5; //0101
        int post =2;
        int Bitmask= 1<<post;
        int newnum= ~(Bitmask) & n;
        System.out.println(newnum);

    }
}
