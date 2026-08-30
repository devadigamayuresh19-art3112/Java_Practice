package Arrays;

import java.util.Scanner;

public class problem_04 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows And Colums:");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int [][] arr=new int[row][column];
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given 2D Array is :");
         for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.err.println();
        }
sc.close();
    }
}

