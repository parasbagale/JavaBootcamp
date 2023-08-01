package day7;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String original = scanner.nextLine();

         String rev = "";

         for ( int i= original.length() - 1; i>=0; i--){
             rev = rev + original.charAt(i);

         }
         //System.out.println(rev);
        if(original.equals(rev))
        {
            System.out.println(original + " Is palindrome");
        }else{
            System.out.println(original + " Is Not_palindrome");

        }

    }
}
