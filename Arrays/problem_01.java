//Take an array of names as input from the user and print them on the screen.
package Arrays;
import java.util.*;
public class problem_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of String:");
        int size= sc.nextInt();
        String name[]= new String[size];
        for(int i=0;i<size;i++){
            name[i]=sc.next();
        }
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }

    }
}
