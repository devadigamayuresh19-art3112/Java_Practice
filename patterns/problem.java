package patterns;
import java.util.*;

public class problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows:");
        int rows = sc.nextInt();

        System.out.println("Enter Number of Columns:");
        int column = sc.nextInt();

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
<<<<<<< HEAD:patterns/problem.java
        sc.close();
=======
>>>>>>> a34cafb (New Problem Solve):Java_practice/patterns/problem.java
    }
}