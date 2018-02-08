//This program displays the Unicode of a given character.
import java.util.Scanner;

public class problem4_9 {

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");

    String i = input.nextLine();
    char ch = i.charAt(0);
    if (i.length() == 1){
    System.out.println("The Unicode for character " + ch + " is " + i.codePointAt(0));
    }
    else
    System.out.println("One character at a time please.");
 }

}