//Program to print inverted pyramid of star:
package patterns;
import java.util.*;

public class problem_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows:");
        int rows = sc.nextInt();

        

        for(int i = rows; i >=1; i--) {
            for(int j=i;j>=1;j--){
            System.out.print("*");
        }
        System.out.println();
      }
<<<<<<< HEAD:patterns/problem_04.java
      sc.close();
=======
>>>>>>> a34cafb (New Problem Solve):Java_practice/patterns/problem_04.java
    }
 } 
