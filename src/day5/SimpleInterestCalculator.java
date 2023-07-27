package day5;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the valur of principle: ");
        double principle = scanner.nextDouble();

        System.out.println("Enter the valur of time in year : ");
        double time = scanner.nextDouble();

        System.out.println("Enter the valur of rate: ");
        double rate = scanner.nextDouble();

        double interest = (principle * time * rate) / 100;

        System.out.println("interest rate : " + interest );

    }
}
