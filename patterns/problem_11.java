//Program to print number pyramid:
package patterns;
import java.util.*;
public class problem_11 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int rows=sc.nextInt();
        int n=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
            }
            System.out.println();
            n++;
        }
<<<<<<< HEAD:patterns/problem_11.java
        sc.close();
=======
>>>>>>> a34cafb (New Problem Solve):Java_practice/patterns/problem_11.java
    }
}
