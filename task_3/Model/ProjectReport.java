// Filename: ProjectReport.java
package Model;

//***********************************************************************
// Class: ProjectReport
// Generates specific reports for projects, such as status, task completion, and project overview.
// Applied Principles:
// - Single Responsibility Principle (SRP): Responsible solely for generating project reports
//***********************************************************************

public class ProjectReport {
      // Generates a status report for a project
    public void generateStatusReport(Project project) {
        System.out.println("Project Report - ID: " + project.getId() + ", Title: " + project.getTitle());
        project.getFreelancerId().ifPresent(id -> System.out.println("Assigned Freelancer ID: " + id));
    }

    public void generateTaskReport(TaskManagement taskManagement) {
        System.out.println("Task Report:");
        // Additional logic to report each task's status
    }
}
