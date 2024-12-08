package View;

import Model.Project;

//***********************************************************************
// Class: ProjectView
// Displays project details to the user, including the freelancer ID if assigned.
//***********************************************************************

public class ProjectView {
    // Display details of the project
    public void displayProjectDetails(Project project) {
        System.out.println("Project Details:");
        System.out.println("ID: " + project.getId());
        System.out.println("Title: " + project.getTitle());
        // If freelancer ID is present, display it
        project.getFreelancerId().ifPresentOrElse(
            id -> System.out.println("Freelancer ID: " + id),
            () -> System.out.println("No freelancer assigned.")
        );
    }

    // Display message to the user
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
