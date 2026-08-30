//Reverse a Given String:
package Strings;

import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String original=sc.nextLine();
        for(int i=original.length()-1;i>=0;i--){
            System.out.print(original.charAt(i));
        }
        System.out.println();
        sc.close();
    }
}
