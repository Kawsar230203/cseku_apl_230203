// Filename: WorkSampleView.java
package View;

import Model.WorkSample;
import java.util.List;

public class WorkSampleView {
    public void displayWorkSamples(List<WorkSample> workSamples) {
        System.out.println("Work Samples:");
        for (WorkSample sample : workSamples) {
            System.out.println("ID: " + sample.getId());
            System.out.println("Description: " + sample.getDescription());
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}