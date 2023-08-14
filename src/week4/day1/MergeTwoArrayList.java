package week4.day1;

import java.util.ArrayList;

public class MergeTwoArrayList {


    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(5);
        list1.add(15);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(20);
        list2.add(12);

        ArrayList<Integer> mergedList = mergeArrayLists(list1, list2);

        System.out.println("Merged ArrayList: " + mergedList);
    }

    public static ArrayList<Integer> mergeArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
    }
}






