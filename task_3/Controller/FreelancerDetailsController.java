// Filename: FreelancerDetailsController.java
package Controller;

import Model.FreelancerDetails;
import View.FreelancerDetailsView;

public class FreelancerDetailsController {
    private FreelancerDetails freelancerDetails;
    private FreelancerDetailsView freelancerDetailsView;

    public FreelancerDetailsController(FreelancerDetails freelancerDetails, FreelancerDetailsView freelancerDetailsView) {
        this.freelancerDetails = freelancerDetails;
        this.freelancerDetailsView = freelancerDetailsView;
    }

    public void addSkill() {
        String skill = freelancerDetailsView.getFreelancerInput("Enter skill to add:");
        freelancerDetails.addSkill(skill);
        freelancerDetailsView.displayMessage("Skill added successfully!");
    }

    public void displayFreelancerDetails() {
        freelancerDetailsView.displayFreelancerDetails(freelancerDetails);
    }
}
