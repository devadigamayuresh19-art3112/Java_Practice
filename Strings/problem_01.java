package Strings;
import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of String");
        int size = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            count += arr[i].length();
        }

        System.out.println("Total Length: " + count);
    }
}