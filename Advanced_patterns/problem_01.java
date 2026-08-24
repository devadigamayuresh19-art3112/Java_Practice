package Advanced_patterns;
<<<<<<< HEAD:Advanced_patterns/problem_01.java

=======
import java.util.*;
>>>>>>> a34cafb (New Problem Solve):Java_practice/Advanced_patterns/problem_01.java
public class problem_01 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
         for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
<<<<<<< HEAD:Advanced_patterns/problem_01.java
        
=======
>>>>>>> a34cafb (New Problem Solve):Java_practice/Advanced_patterns/problem_01.java
    }
}
