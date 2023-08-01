package week3.day1;

import java.util.Scanner;

public class ShortInAscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the list: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the Numeric value of the list: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i=0; i< size; i++){
            System.out.print(array[i] + ",");
        }
    }
}