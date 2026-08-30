//Program to add two numbers of different types
import java.util.*;
public class variable_1 
{

    public static void main(String[] args)
    {
       System.out.println("Enter Two Numbers :");
       Scanner sc = new Scanner(System.in);
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       System.out.println(num1+num2);
       float num3=sc.nextFloat();
       float num4=sc.nextFloat();
       System.out.println(num3+num4);
       sc.close();
    }
    
}