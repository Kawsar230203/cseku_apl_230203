package View;

import Model.JobAssignment.Assignment;

public class JobAssignmentView {
    public void displayAssignmentDetails(Assignment assignment) {
        System.out.println("Job Assignment Details:");
        System.out.println(assignment);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
