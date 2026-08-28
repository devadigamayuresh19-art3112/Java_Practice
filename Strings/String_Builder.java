package Strings;

public class String_Builder {
    public static void main(String[] args) {
        //String Builder Declaration:
        StringBuilder name= new StringBuilder("Mayuresh");
        System.out.println(name);
        //Get A Character from Index
        System.out.println(name.charAt(3));
        //Set a Character at Index
        name.setCharAt(3, 'r');
        System.out.println(name);
        //Insert a Character at Some Index
        name.insert(3, 'u');
        System.out.println(name);
        //Delete char at some Index
        name.delete(0, 2);      //last index excluding.
        System.out.println(name);
        //Append a char
        name.append(" Devadiga");
        System.out.println(name); 
        //Print Length of String
        System.out.println(name.length());
    }
}
