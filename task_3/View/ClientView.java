// Updated structure with separate packages for Model, View, and Controller.

// Filename: ClientView.java
package View;

import Model.Client;
import java.util.Scanner;

public class ClientView {
    private Scanner scanner = new Scanner(System.in);

    public void displayClientDetails(Client client) {
        System.out.println("Client Details:");
        System.out.println("ID: " + client.getId());
        System.out.println("Name: " + client.getName());
        System.out.println("Email: " + client.getEmail());
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public String getClientInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public int getClientIdInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }
}

















