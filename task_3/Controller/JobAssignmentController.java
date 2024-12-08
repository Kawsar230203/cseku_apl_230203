package Controller;

import Model.JobAssignment;
import Model.JobAssignment.Assignment;
import View.JobAssignmentView;

public class JobAssignmentController {
    private JobAssignment jobAssignment;
    private JobAssignmentView jobAssignmentView;

    public JobAssignmentController(JobAssignment jobAssignment, JobAssignmentView jobAssignmentView) {
        this.jobAssignment = jobAssignment;
        this.jobAssignmentView = jobAssignmentView;
    }

    public void assignJob(int clientId, int freelancerId, int projectId) {
        jobAssignment.assignJob(clientId, freelancerId, projectId);
        jobAssignmentView.displayMessage("Job assigned successfully!");
    }

    public void displayAssignmentDetails(int projectId) {
        Assignment assignment = jobAssignment.getAssignment(projectId);
        if (assignment != null) {
            jobAssignmentView.displayAssignmentDetails(assignment);
        } else {
            jobAssignmentView.displayMessage("Assignment not found for Project ID: " + projectId);
        }
    }
}
