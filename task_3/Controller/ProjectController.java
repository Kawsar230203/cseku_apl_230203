package Controller;

import Model.Project;
import Model.ProjectManagement;
import View.ProjectView;

//***********************************************************************
// Class: ProjectController
// Handles the logic of interacting with the project (adding/updating projects)
//***********************************************************************

public class ProjectController {
    private ProjectManagement projectManagement;
    private ProjectView projectView;

    public ProjectController(ProjectManagement projectManagement, ProjectView projectView) {
        this.projectManagement = projectManagement;
        this.projectView = projectView;
    }

    // Add a new project to the system
    public void addProject(int id, String title) {
        projectManagement.addProject(id, title);
        projectView.displayMessage("Project added successfully!");
    }

    // Display the details of a project by its ID
    public void displayProject(int id) {
        Project project = projectManagement.getProject(id);
        if (project != null) {
            projectView.displayProjectDetails(project);
        } else {
            projectView.displayMessage("Project not found.");
        }
    }

    // Assign a freelancer to a project
    public void assignFreelancer(int projectId, int freelancerId) {
        projectManagement.assignFreelancer(projectId, freelancerId);
        projectView.displayMessage("Freelancer assigned successfully!");
    }
}
