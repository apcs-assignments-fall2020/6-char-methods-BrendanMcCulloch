import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch<=90 && 65<=ch) {
            ch = (char)(ch + 32);
            return ch;
        }
        else{
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String string = "";
        for (int i = 0; i<str.length(); i++){
            char stringchar = str.charAt(i);
            if (stringchar >= 65 && stringchar <= 90){
                stringchar = (char)((stringchar + 32));
            }
            string = string + stringchar;
        }
        return string;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (ch<=122 && ch>=97){
            ch = (char)(ch - 32);
            return ch;
        }
        else{
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i++){
            char stringchar = str.charAt(1);
            if (stringchar >= 97 && stringchar<=122){
                stringchar = (char)((stringchar - 32));
            }
            string = string + stringchar;
        }
        return string;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("character : ");
        String stringone = scan.next();
        char charone = stringone.charAt(0);
        System.out.println(toLower(charone));
        System.out.print("string: " );
        String stringtwo = scan.nextLine();
        System.out.println(myToLowerCase(stringtwo));
        System.out.print("character : ");
        String stringthree = scan.next();
        char chartwo = stringthree.charAt(0);
        System.out.println(toUpper(chartwo));
        System.out.print("string: " );
        String stringfour = scan.nextLine();
        System.out.println(myToUpperCase(stringfour));



        
    }
}
