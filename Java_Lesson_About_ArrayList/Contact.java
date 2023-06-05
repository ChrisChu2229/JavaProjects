package Java_Lesson_About_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {

    public static void main(String[] args) {
        ArrayList<String> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Show contacts");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt(); // when you enter a number and then press enter, a \n character appears so
                                            // it just skips all the work below
            scanner.nextLine(); // this line is necessary to eat up the '\n' character

            if (choice == 1) {
                System.out.println("Enter the name of the contact to add:");
                String name = scanner.nextLine();
                contacts.add(name);
            } else if (choice == 2) {
                System.out.println("Enter the name of the contact to remove:");
                String name = scanner.nextLine();
                if (contacts.contains(name)) {
                    contacts.remove(name);
                } else {
                    System.out.println("Contact not found.");
                }
            } else if (choice == 3) {
                System.out.println("Contacts:");
                for (String contact : contacts) {
                    System.out.println(contact);
                }
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }
        }

        scanner.close();
    }
}
