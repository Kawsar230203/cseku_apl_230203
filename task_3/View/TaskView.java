// Filename: TaskView.java
package View;

import Model.Task;

public class TaskView {
    public void displayTaskDetails(Task task) {
        System.out.println("Task Details:");
        System.out.println("ID: " + task.getTaskId());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Status: " + task.getStatus());
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}