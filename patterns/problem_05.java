//Program to print rotated half pyramid:
package patterns;

import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows:");
        int rows = sc.nextInt();

        

        for(int i = 1; i <=rows; i++) {

            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
      }
<<<<<<< HEAD:patterns/problem_05.java
      sc.close();
=======
>>>>>>> a34cafb (New Problem Solve):Java_practice/patterns/problem_05.java
    }
}
