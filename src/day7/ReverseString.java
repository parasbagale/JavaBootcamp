package day7;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String to Reverse: ");
        String originalString = scanner.nextLine();
        int totalLength = originalString.length();

        String reversedString = " ";

        for (int i = totalLength; i > 0; i--) {
            reversedString = reversedString.concat(originalString.substring(i - 1, i));
        }
        System.out.println(reversedString);
    }

    }


