//program to print solid rhombus
package patterns;
import java.util.*;
public class problem_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
