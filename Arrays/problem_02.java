//Find the maximum & minimum number in an array of integers.
package Arrays;

import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size=sc.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter Elements of Array:");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Number is " + max);
        System.out.println("Minimum Number is " + min);

    }
}
