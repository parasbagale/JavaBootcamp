package week3.day3;

import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first intiger: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second intiger: ");
        int num2 = scanner.nextInt();

        if(num2!=0 && num1%num2 == 0){
            System.out.println(num1 + " is multiple of " + num2 + " : yes");
        }else{
            System.out.println(num1 + " is not multiple of " + num2 + " : no");
        }
    }
}
