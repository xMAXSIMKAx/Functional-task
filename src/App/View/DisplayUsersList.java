package App.View;

import App.Controller.UserController;
import App.Model.User;

import java.util.List;
import java.util.function.Consumer;

class DisplayUsersList implements Consumer<Void> {
    private UserController userController;

    public DisplayUsersList(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void accept(Void unused) {
        List<User> users = userController.getUsers();
        System.out.println("User list:");
        System.out.println("Name\t\tPhone");
        for (User user : users) {
            System.out.println(user.getName() + "\t\t" + user.getPhone());
        }
    }
}