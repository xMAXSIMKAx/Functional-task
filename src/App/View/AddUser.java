package App.View;

import App.Controller.UserController;

import java.util.Scanner;
import java.util.function.Consumer;

class AddUser implements Consumer<Void> {
    private UserController userController;
    private Scanner scanner;

    public AddUser(Scanner scanner, UserController userController) {
        this.userController = userController;
        this.scanner = scanner;
    }

    @Override
    public void accept(Void unused) {
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter phone:");
        String phone = scanner.next();
        userController.addUser(name, phone);
        System.out.println("Success!");
    }
}
