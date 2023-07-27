package day7;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int lengthOfArray = scanner.nextInt();

        int[] numberOfArray = new int[lengthOfArray];

        int counter = 0;
        int sum = 0;

        for(int i =0; i<numberOfArray.length; i++){
            numberOfArray[i] = scanner.nextInt();
            counter++;
            sum += numberOfArray[i];
        }
        float average = sum/counter;
        System.out.println("sum :" + sum + " average :" + average);
    }
}
