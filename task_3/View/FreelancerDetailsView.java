package View;

import Model.FreelancerDetails;
import java.util.Scanner;

public class FreelancerDetailsView {
    private Scanner scanner = new Scanner(System.in);

    // Display freelancer details
    public void displayFreelancerDetails(FreelancerDetails freelancer) {
        System.out.println("Freelancer Details:");
        System.out.println("ID: " + freelancer.getId());
        System.out.println("Name: " + freelancer.getName());
        System.out.println("Skills: " + freelancer.getSkills());
    }

    // Display message to the user
    public void displayMessage(String message) {
        System.out.println(message);
    }

    // Get freelancer input (string)
    public String getFreelancerInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    // Get freelancer ID input (integer) - now handles newline correctly
    public int getFreelancerIdInput(String prompt) {
        System.out.println(prompt);
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline character
        return id;
    }
}
