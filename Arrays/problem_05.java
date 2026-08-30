package Arrays;

import java.util.Scanner;

public class problem_05 {
    
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
        System.out.println("Enter Element to Search:");
        int ele=sc.nextInt();
         for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               if(arr[i][j]==ele){
                System.err.println("Element found at "+" "+"("+i+","+j+")");

               }
            }
            
        }
         sc.close();
    }
}
