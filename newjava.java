import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the To-Do List application!");
        System.out.println("Available commands: add, remove, view, exit");

        while (true) {
            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Enter a task to add: ");
                    String taskToAdd = scanner.nextLine();
                    tasks.add(taskToAdd);
                    System.out.println("Task added: " + taskToAdd);
                    break;

                case "remove":
                    System.out.print("Enter the task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        String removedTask = tasks.remove(taskNumber - 1);
                        System.out.println("Removed task: " + removedTask);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case "view":
                    System.out.println("To-Do List:");
                    if (tasks.isEmpty()) {
                        System.out.println("Your list is empty.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case "exit":
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }
}
