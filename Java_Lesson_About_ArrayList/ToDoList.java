package Java_Lesson_About_ArrayList;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.remove(taskIndex);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void printTasks() {
        if (tasks.size() == 0) {
            System.out.println("Your To-Do List is empty.");
            return;
        }

        System.out.println("Your To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.println();
    }
}
