package Controller;

import Model.Portfolio;
import View.PortfolioView;

//***********************************************************************
// Class: PortfolioController
// Handles the logic of interacting with the portfolio (adding/updating work samples)
//***********************************************************************

public class PortfolioController {
    private Portfolio portfolio;
    private PortfolioView portfolioView;

    public PortfolioController(Portfolio portfolio, PortfolioView portfolioView) {
        this.portfolio = portfolio;
        this.portfolioView = portfolioView;
    }

    // Add a new work sample to the portfolio
    public void addWorkSample(int id, String description) {
        portfolio.addWorkSample(id, description);
        portfolioView.displayMessage("Work sample added successfully!");
    }

    // Update an existing work sample's description
    public void updateWorkSample(int id, String newDescription) {
        portfolio.updateWorkSample(id, newDescription);
        portfolioView.displayMessage("Work sample updated successfully!");
    }

    // Display the portfolio to the user
    public void displayPortfolio() {
        portfolioView.displayPortfolio(portfolio);
    }
}
