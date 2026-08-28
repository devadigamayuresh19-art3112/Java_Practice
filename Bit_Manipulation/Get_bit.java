//Get Bit:
package Bit_Manipulation;

public class Get_bit {
    public static void main(String[] args) {
        int n=5;   //0101
        int post=2;
        int Bitmask= 1<<post;
        if((Bitmask & n)==0){
            System.out.println("Bit is Zero");
        }
        else{
            System.out.println("Bit is Non zero");
        }
    }
}
