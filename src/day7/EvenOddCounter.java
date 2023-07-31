package day7;

import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter How many Number You want to enter : ");
        int lengthOfArray = scanner.nextInt();

        System.out.println("enter the number from 1 to n:");


        int [] number = new int[lengthOfArray];

        for(int i=0; i<number.length;i++){
            number[i] = scanner.nextInt();

            if(number[i]%2 == 0){
                System.out.println(number[i] + " is even");
            }else{
                System.out.println(number[i] + " is odd");
            }
        }
    }
}

