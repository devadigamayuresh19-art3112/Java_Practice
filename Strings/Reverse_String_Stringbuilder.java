//Reversing a String:
package Strings;

public class Reverse_String_Stringbuilder {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder("Mayuresh");
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
}
