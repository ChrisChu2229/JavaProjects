package Java_Lesson_About_ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Show tasks");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Enter the task:");
                String task = scanner.nextLine();
                toDoList.addTask(task);
            } else if (choice == 2) {
                System.out.println("Enter the number of the task to remove:");
                int taskIndex = scanner.nextInt() - 1;
                scanner.nextLine();
                toDoList.removeTask(taskIndex);
            } else if (choice == 3) {
                toDoList.printTasks();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }
        }

        scanner.close();
    }
}
