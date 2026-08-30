//Program to print even number upto n:
import java.util.*;
public class even_no_loop {

    public static void main(String[] args){
        System.out.println("Enter A Number :");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=2;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        sc.close();

    }
}