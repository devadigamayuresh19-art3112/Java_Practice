//Program to Print Prime numbers from 1 to n:
import java.util.*;
public class problem {
    public static void main(String[] args) {
        System.out.println("The Prime Numbers Are:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The Prime Numbers Are:");
        int i=2,count=0;
        while (i<=n) {
            for(int j=1;j<=n;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
            i++;
            count=0;
        }
<<<<<<< HEAD:problem.java
        sc.close();
=======
>>>>>>> a34cafb (New Problem Solve):Java_practice/problem.java
    }
}
