package week4.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EachCharFrequencyCounter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            Map<Character, Integer> charFrequencyMap = new HashMap<>();

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) { // Count only letters (ignore non-letter characters)
                    c = Character.toLowerCase(c); // Convert to lowercase for consistent counting
                    charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
                }
            }

            System.out.println("Character Frequency:");
            for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }


