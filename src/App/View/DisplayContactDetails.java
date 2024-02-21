package App.View;

import App.Controller.UserController;
import App.Model.User;

import java.util.Scanner;
import java.util.function.Consumer;

class DisplayContactDetails implements Consumer<Void> {
    private UserController userController;
    private Scanner scanner;

    public DisplayContactDetails(UserController userController, Scanner scanner) {
        this.userController = userController;
        this.scanner = scanner;
    }

    @Override
    public void accept(Void unused) {
        System.out.println("Enter contact name:");
        String contactName = scanner.next();
        User user = userController.findUserByName(contactName);
        if (user != null) {
            System.out.println("Name: " + user.getName());
            System.out.println("Phone: " + user.getPhone());
        } else {
            System.out.println("Contact not found");
        }
    }
}
