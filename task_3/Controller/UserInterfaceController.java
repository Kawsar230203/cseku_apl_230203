// Filename: UserInterfaceController.java
package Controller;

import View.UserInterfaceView;

public class UserInterfaceController {
    private UserInterfaceView userInterfaceView;

    public UserInterfaceController(UserInterfaceView userInterfaceView) {
        this.userInterfaceView = userInterfaceView;
    }

    public void displayMenu() {
        userInterfaceView.displayMenu();
    }
}