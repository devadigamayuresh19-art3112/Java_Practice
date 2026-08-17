//Program to print palindromic number pyramid.:
package patterns;

public class problem_12 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=(rows-i);j++){
                System.err.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
