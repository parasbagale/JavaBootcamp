package week4.day2;

import java.util.*;

public class RemoveDublicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers separated by spaces: ");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + part);
            }
        }

        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("List with duplicates removed:");
        for (Integer num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}
