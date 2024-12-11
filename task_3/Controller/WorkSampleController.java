// Filename: WorkSampleController.java
package Controller;

import Model.Portfolio;
import Model.WorkSample;
import View.WorkSampleView;

public class WorkSampleController {
    private Portfolio portfolio;
    private WorkSampleView workSampleView;

    public WorkSampleController(Portfolio portfolio, WorkSampleView workSampleView) {
        this.portfolio = portfolio;
        this.workSampleView = workSampleView;
    }

    public void addWorkSample(int id, String description) {
        portfolio.addWorkSample(id, description);
        workSampleView.displayMessage("Work sample added successfully!");
    }

    public void displayWorkSamples() {
        workSampleView.displayWorkSamples(portfolio.getWorkSamples());
    }
}