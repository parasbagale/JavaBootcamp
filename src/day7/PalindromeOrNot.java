package day7;

import java.util.Scanner;

public class PalindromOrNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String original = scanner.nextLine();

         String reverse = " ";

         for ( int i= original.length() - 1; i>=0; i--){
             reverse = reverse + original.charAt(i);

         }
         //System.out.println(reverse);
        if(original.equals(reverse))
        {
            System.out.println(original + " Is palindrome");
        }else{
            System.out.println(original + " Is Not_palindrome");

        }

    }
}
