package arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
       // ArrayList = a resizable array.

        ArrayList<String>food = new ArrayList<String>();

        food.add("pizza");
        food.add("hotdog");

        food.set(0,"Apple");
        food.remove(1);
        food.clear();

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
