//Program to calculate radius of circle
import java.util.*;
public class area
{
   public  static void main (String[] args)
   {
      System.out.println("Enter the Radius of Circle :");
      Scanner sc= new Scanner(System.in);
      float rad=sc.nextFloat();
      final float PI = 3.14F;
      System.out.println(PI*rad*rad);
      sc.close();
   } 
}