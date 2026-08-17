//Program to calculate Factorial of a NUmber :

import java.util.*;
public class problem_02 {
    public static int fact(int a){
        int fact=1;
        for (int i=1;i<=a;i++){
            fact*=i;

        }
        return fact;

    }
    public static void main(String[] args) {
        System.out.println("Enter A Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Factorial of " + num + "is" + fact(num));
    }
}
