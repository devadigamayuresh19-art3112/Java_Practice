package patterns;
//Program to print number pattern
import java.util.*;
public class problem_06{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int rows=sc.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
<<<<<<< HEAD:patterns/problem_06.java
        sc.close();
=======
>>>>>>> a34cafb (New Problem Solve):Java_practice/patterns/problem_06.java
    }
}