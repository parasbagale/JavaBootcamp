package week3.day2;

public class StringToArray {
    public static void main(String[] args){
        String input = "How are you";

        String[] arr = input.split(" ");

        for(String word : arr){
            System.out.println(word);
        }

    }
}
