package patterns;
//Program to print inverted number pattern
import java.util.*;
public class problem_07{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int rows=sc.nextInt();
        for (int i=rows;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
<<<<<<< HEAD:patterns/problem_07.java
        sc.close();
=======
>>>>>>> a34cafb (New Problem Solve):Java_practice/patterns/problem_07.java
    }
}