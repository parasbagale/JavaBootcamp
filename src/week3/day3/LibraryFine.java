package week3.day3;

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter returned Date (dd/mm/yyyy): ");
        //input: returned date
        int returnedDay = scanner.nextInt();
        int returnedMonth = scanner.nextInt();
        int returnedYear = scanner.nextInt();


        System.out.println("Enter due Date (dd/mm/yyyy) :");
        //input: due date
        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();

        //calculate the fine
        int fine =0;
        if(returnedYear > dueYear){
            fine = 1000; // fixed fine if return after calendar year
        }else if(returnedYear == dueYear && returnedMonth > dueMonth){
            fine = 500 * (returnedMonth - dueMonth); //fine per month
        }else if(returnedYear == dueYear && returnedMonth == dueMonth && returnedDay > dueDay){
            fine = 15 * (returnedDay - dueDay); //fine per day
        }
        System.out.println( " fine amount is " + fine);
        scanner.close();
    }
}
