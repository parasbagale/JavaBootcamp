package week3.day2;

public class FindIndex {
    public static void main(String[] args) {
        int[] array = {1, 9, 4, 8, 5, 7};
        int item = 4;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                System.out.println(i);
            }
        }
    }
}