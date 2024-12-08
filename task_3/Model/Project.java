package Model;

import java.util.Optional;

//***********************************************************************
// Class: Project
// Represents a project with attributes like project ID, title, and an optional freelancer assignment.
// Applied Principles:
// - Single Responsibility Principle (SRP): Responsible solely for storing project data
//***********************************************************************

public class Project {
    private int id;
    private String title;
    private Optional<Integer> freelancerId = Optional.empty();  // Freelancer ID is optional

    public Project(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    // Set freelancer for the project
    public void setFreelancer(int freelancerId) {
        this.freelancerId = Optional.of(freelancerId);  // Assign the freelancer ID
    }

    // Get freelancer ID (if present)
    public Optional<Integer> getFreelancerId() {
        return freelancerId;
    }
}
