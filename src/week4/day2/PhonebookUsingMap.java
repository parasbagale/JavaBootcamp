package week4.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhonebookUsingMap {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<String, String> phonebookMap = new HashMap<>();

            while (true) {
                System.out.println("Phonebook Menu:");
                System.out.println("1. Add Entry");
                System.out.println("2. Search Entry");
                System.out.println("3. Remove Entry");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.nextLine();
                        phonebookMap.put(name, phoneNumber);
                        System.out.println("Entry added.");
                        break;
                    case 2:
                        System.out.print("Enter name to search: ");
                        String searchName = scanner.nextLine();
                        if (phonebookMap.containsKey(searchName)) {
                            System.out.println("Phone number: " + phonebookMap.get(searchName));
                        } else {
                            System.out.println("Entry not found.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter name to remove: ");
                        String removeName = scanner.nextLine();
                        if (phonebookMap.containsKey(removeName)) {
                            phonebookMap.remove(removeName);
                            System.out.println("Entry removed.");
                        } else {
                            System.out.println("Entry not found.");
                        }
                        break;
                    case 4:
                        System.out.println("Exiting phonebook.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    }







