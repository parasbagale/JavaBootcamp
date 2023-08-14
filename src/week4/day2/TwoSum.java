package week4.day2;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoSum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements in the list: ");
            int n = scanner.nextInt();

            int[] nums = new int[n];
            System.out.println("Enter the elements of the list:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            System.out.print("Enter the target sum: ");
            int target = scanner.nextInt();

            Set<Integer> numSet = new HashSet<>();

            for (int num : nums) {
                int complement = target - num;
                if (numSet.contains(complement)) {
                    System.out.println("Two numbers that add up to the target sum are: " + complement + " and " + num);
                    return;
                }
                numSet.add(num);
            }

            System.out.println("No two numbers found that add up to the target sum.");
        }
    }


