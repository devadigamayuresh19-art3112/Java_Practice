package Arrays;

import java.util.Scanner;

public class problem_03 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size=sc.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter Elements of Array:");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean sort=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sort=false;
            }
        }
        if(sort){
            System.out.println("Sorted in ascending");
        }
        else{
            System.out.println("Not sorted");
        }
sc.close();
    }
}
