package week3.day1;

import java.util.Scanner;

public class CheckSortedInAscending {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of elements: ");
        int size = scanner.nextInt();
        int array[]= new int[size];

        System.out.println("Enter the numeric value of element ");
        for(int i=0; i<size; i++){
            array[i] = scanner.nextInt();
        }
        boolean isascending = true;

        for(int i=0; i<size-1; i++){
            if(array[i]>array[i+1]){
                isascending = false;
            }
        }
        if(isascending){
            System.out.println("the elements is in Ascending");
        }else{
            System.out.println("the elements is not Ascending");
        }

    }
}
