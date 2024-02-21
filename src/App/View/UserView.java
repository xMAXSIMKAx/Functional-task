package App.View;

import App.Controller.UserController;

import java.util.Scanner;
import java.util.function.Consumer;

public class UserView {
    private UserController userController;
    private Scanner scanner;

    public UserView(Scanner scanner, UserController userController) {
        this.userController = userController;
        this.scanner = scanner;
    }

    public void displayMainMenu() {
        int choice;
        do {
            System.out.println("1. Add User");
            System.out.println("2. Find User");
            System.out.println("3. Show All Contacts");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    executeAction(new AddUser(scanner, userController));
                    break;
                case 2:
                    executeAction(new DisplayContactDetails(userController, scanner));
                    break;
                case 3:
                    executeAction( new DisplayUsersList(userController));
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private void executeAction(Consumer<Void> action) {
        action.accept(null);
    }
}