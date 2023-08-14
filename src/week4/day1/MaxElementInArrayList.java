package week4.day1;

import java.util.ArrayList;


        public class MaxElementInArrayList {
            public static void main(String[] args) {
                ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(10);
                numbers.add(5);
                numbers.add(15);
                numbers.add(8);
                numbers.add(20);

                int max = findMaxElement(numbers);
                System.out.println("The maximum element is: " + max);
            }

            public static int findMaxElement(ArrayList<Integer> list) {
                if (list == null || list.isEmpty()) {
                    throw new IllegalArgumentException("List is empty or null");
                }

                int max = list.get(0);
                for (int i = 1; i < list.size(); i++) {
                    if (list.get(i) > max) {
                        max = list.get(i);
                    }
                }
                return max;
            }
        }

