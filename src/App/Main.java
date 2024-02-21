package App;

import App.Controller.UserController;
import App.View.UserView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserView userView = new UserView(new Scanner(System.in), new UserController());
        userView.displayMainMenu();
    }
}
