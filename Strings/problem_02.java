//Input a string from the user. Create a new string called ‘result’ in which youwill replace the letter ‘e’ in the original string with letter ‘i’.
package Strings;

import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String original=sc.next();
        String result= original.replace('e', 'i');
        System.err.println(result);
        sc.close();
    }
}
