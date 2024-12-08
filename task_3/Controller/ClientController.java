// Filename: ClientController.java
package Controller;

import Model.ClientManagement;
import View.ClientView;
import Model.Client;

public class ClientController {
    private ClientManagement clientManagement;
    private ClientView clientView;

    public ClientController(ClientManagement clientManagement, ClientView clientView) {
        this.clientManagement = clientManagement;
        this.clientView = clientView;
    }

    public void addClient() {
        int id = clientView.getClientIdInput("Enter Client ID:");
        clientView.getClientInput(""); // Clear buffer
        String name = clientView.getClientInput("Enter Client Name:");
        String email = clientView.getClientInput("Enter Client Email:");
        clientManagement.addClient(id, name, email);
        clientView.displayMessage("Client added successfully!");
    }

    public void displayClient() {
        int id = clientView.getClientIdInput("Enter Client ID to display:");
        Client client = clientManagement.getClient(id);
        if (client != null) {
            clientView.displayClientDetails(client);
        } else {
            clientView.displayMessage("Client not found.");
        }
    }

    public void removeClient() {
        int id = clientView.getClientIdInput("Enter Client ID to remove:");
        clientManagement.removeClient(id);
        clientView.displayMessage("Client removed successfully.");
    }
}
