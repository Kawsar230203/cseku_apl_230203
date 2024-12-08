package Model;

import java.util.ArrayList;
import java.util.List;

//***********************************************************************
// Class: Portfolio
// Manages the portfolio for a freelancer, allowing adding and updating work samples.
// Applied Principles:
// - Single Responsibility Principle (SRP): Focused solely on managing work samples
// - Open/Closed Principle (OCP): Can be extended to add more functionality without modifying existing code
//***********************************************************************

public class Portfolio {
    private List<WorkSample> workSamples = new ArrayList<>();

    // Method to add a new work sample
    public void addWorkSample(int id, String description) {
        workSamples.add(new WorkSample(id, description));
    }

    // Method to update an existing work sample's description
    public void updateWorkSample(int id, String newDescription) {
        for (WorkSample sample : workSamples) {
            if (sample.getId() == id) {
                sample.setDescription(newDescription);
                return; // Exit once the work sample is updated
            }
        }
        System.out.println("Work sample with ID " + id + " not found.");
    }

    // Method to retrieve all work samples
    public List<WorkSample> getWorkSamples() {
        return workSamples;
    }
}
