import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> tasks = new LinkedHashSet<>();

        System.out.print("Введіть кількість завдань: ");
        int numberOfTasks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfTasks; i++) {
            System.out.print("Введіть завдання " + i + ": ");
            String task = scanner.nextLine();
            tasks.add(task);  // Додаємо завдання у LinkedHashSet
        }

        System.out.println("Список справ: " + tasks);
        scanner.close();
    }
}
