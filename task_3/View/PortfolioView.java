package View;

import Model.Portfolio;

//***********************************************************************
// Class: PortfolioView
// Handles the display of the portfolio to the user.
//***********************************************************************

public class PortfolioView {
    // Display portfolio details
    public void displayPortfolio(Portfolio portfolio) {
        System.out.println("Portfolio Details:");
        portfolio.getWorkSamples().forEach(sample -> {
            System.out.println("ID: " + sample.getId());
            System.out.println("Description: " + sample.getDescription());
        });
    }

    // Display a message to the user
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
