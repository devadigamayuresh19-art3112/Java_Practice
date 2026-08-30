//Input an email from the user. You have to create a username from the emailby deleting the part that comes after ‘@’. Display that username to the user.
package Strings;

import java.util.Scanner;

public class problem_03 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String original=sc.next();
        String result= "";
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)=='@'){
                break;
            }
            else{

            result+=original.charAt(i);
            }            
        }
        System.err.println(result);
        sc.close();
    }
}
