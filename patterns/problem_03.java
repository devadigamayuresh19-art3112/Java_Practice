//Program to print pyramid:
package patterns;
import java.util.*;

public class problem_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows:");
        int rows = sc.nextInt();

        

        for(int i = 1; i <= rows; i++) {
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
      }

      sc.close();

    }
 } 

