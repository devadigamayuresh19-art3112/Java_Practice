//Program to check Number is even,odd or zero:
import java.util.*;
public class num{
    public static void main(String [] args){
        System.out.println("Enter A Number:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        if (no==0){
            System.out.println("Number is Zero");
        }else if (no%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is Odd");
        }
<<<<<<< HEAD:num.java
        sc.close();
=======
>>>>>>> a34cafb (New Problem Solve):Java_practice/num.java
    }
}