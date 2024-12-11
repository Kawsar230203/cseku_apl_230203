// Filename: TaskController.java
package Controller;

import Model.TaskManagement;
import Model.Task;
import View.TaskView;

public class TaskController {
    private TaskManagement taskManagement;
    private TaskView taskView;

    public TaskController(TaskManagement taskManagement, TaskView taskView) {
        this.taskManagement = taskManagement;
        this.taskView = taskView;
    }

    public void addTask(int id, String description) {
        taskManagement.addTask(id, description);
        taskView.displayMessage("Task added successfully!");
    }

    public void updateTaskStatus(int id, String status) {
        Task task = taskManagement.getTask(id);
        if (task != null) {
            taskManagement.updateTaskStatus(id, status);
            taskView.displayMessage("Task status updated successfully!");
        } else {
            taskView.displayMessage("Task not found.");
        }
    }

    public void displayTask(int id) {
        Task task = taskManagement.getTask(id);
        if (task != null) {
            taskView.displayTaskDetails(task);
        } else {
            taskView.displayMessage("Task not found.");
        }
    }
}
    
