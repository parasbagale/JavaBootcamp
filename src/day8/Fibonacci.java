package day8;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer :");
        int n = scanner.nextInt();

        int firstNumber=0;
        int secondNumber=1;
        for (int i=0; i<n;i++){
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber =thirdNumber;
            System.out.println(firstNumber);
        }
    }

}
