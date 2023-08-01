package week3.day1;

import java.util.Scanner;

public class StringInputCountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String enterString = scanner.nextLine();
        int[] array = new int[enterString.length()];

        System.out.println("Enter the Character you want to count: ");
        String characterToCount = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < enterString.length(); i++) {
            if (array[i] < characterToCount.length())  {
                counter++;
            }

        }
        System.out.println(counter);
    }
}
