package App.Controller;

import App.Model.User;

import java.util.ArrayList;
import java.util.List;

class UserController {
    private List<User> users;

    public UserController(List<User> users) {
        this.users = new ArrayList<User>();
        users.add(new User("John", "+14325452324"));
        users.add(new User("Jane", "+14322222324"));
        users.add(new User("Mary", "+74323232324"));
        users.add(new User("Bob", "+74888888824"));

    }

    public List<User> getUsers() {
        return users;
    }

    public void addUsers(String name, String phone) {
        users.add(new User(name, phone));
    }

    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

}
