package day6;

import java.util.Scanner;

public class SumOfArrayStatic {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of Array: ");
        int lengthOfArray = scanner.nextInt();

        int[] numberOfArray = new int[lengthOfArray];

        int sum=0;
        for(int i=0; i < numberOfArray.length; i++)
        {
            System.out.println("Enter the Index [" + i + "]:  ") ;
            numberOfArray[i] = scanner.nextInt();
            sum += numberOfArray[i];
        }
        System.out.println("sum of all number :" + sum);
    }
}
