package day8;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number from 1 to N :");
        int number = scanner.nextInt();

        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                counter++;
        }
                if (counter == 2)
                    System.out.println("number is prime");
                else
                    System.out.println("number is not prime");


        }
    }
