package holtpontelkerulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ResourceManager resourceManager = new ResourceManager();
        TaskManager taskManager = new TaskManager(resourceManager);

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(",");
            String taskName = input[0];
            int inputLength = input.length;
            String[] utasitasok = new String[inputLength-1];
            System.arraycopy(input, 1, utasitasok, 0, inputLength - 1);
            taskManager.createTask(taskName,utasitasok);
        }


    }
}
