package Functions;
import java.util.*;
public class problem_04 {
    public static int fact(int a){
        if (a==0){
            return 1;
        }
        return a*fact(a-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter A Number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Factorial of "+ num + "is" +" "+ fact(num));
        sc.close();
}
}
