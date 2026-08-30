//Program to make a calculator:
import java.util.*;
public class calculator{
    public static void main(String[] args){
        System.out.println("Enter Two Numbers:");
        Scanner sc=new Scanner(System.in);
        float num1=sc.nextFloat();
        float num2=sc.nextFloat();
        System.out.println("Enter Your Choice :\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:System.out.println(num1+num2);
            break;
            case 2:System.out.println(num1-num2);
            break;
            case 3:System.out.println(num1*num2);
            break;
            case 4:System.out.println(num1/num2);
            break;
            case 5:System.out.println(num1%num2);
            break;
            default:System.out.println("Enter A Valid Choice!");
                
               
        }
        sc.close();

    }
}