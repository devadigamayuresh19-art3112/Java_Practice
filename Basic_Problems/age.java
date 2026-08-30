//Program to check age using if-else statement:
import java.util.*;
public class age{
    public static void main(String [] args){
    System.out.println("Enter Your Age:");
    Scanner sc=new Scanner(System.in);
    int y_age=sc.nextInt();
    if(y_age>18){
        System.out.println("You Are Adult");
    }else{
        System.out.println("You Are Not An Adult");
    }

    sc.close();

    }
}