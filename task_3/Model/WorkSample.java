package Model;

//***********************************************************************
// Class: WorkSample
// Represents a sample of work in a freelancer's portfolio, with a description.
// Applied Principles:
// - Single Responsibility Principle (SRP): Responsible solely for storing work sample data
//***********************************************************************

public class WorkSample {
    private int id;
    private String description;

    // Constructor
    public WorkSample(int id, String description) {
        this.id = id;
        this.description = description;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description (to allow updating)
    public void setDescription(String description) {
        this.description = description;
    }
}
