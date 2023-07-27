package day7;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentenceFromUser = scanner.nextLine().toLowerCase();

        char[] array =  sentenceFromUser.toCharArray();
        int counter = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] == 'a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u'){
                counter++;
            }
        }System.out.println(counter);

    }

}
