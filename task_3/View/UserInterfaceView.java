// Filename: UserInterfaceView.java
package View;

import java.util.Scanner;

public class UserInterfaceView {
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Manage Clients");
        System.out.println("2. Manage Freelancers");
        System.out.println("3. Manage Projects");
        System.out.println("4. Manage Tasks");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public int getUserChoice() {
        return scanner.nextInt();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}