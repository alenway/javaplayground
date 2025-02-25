import java.util.ArrayList;
import java.util.List;

class AuthenticationSystem {
    private List<User> users;

    public AuthenticationSystem() {
        this.users = new ArrayList<>();
    }

    public void registerUsers(String userName, String password) {
        // Check if the username already exists
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                System.out.println("User already exists. Please choose a different one.");
                return;
            }
        }
        // Add new user to the list outside the loop
        users.add(new User(userName, password));
        System.out.println("Registration Successful.");
    }

    public boolean loginUser(String userName, String password) {
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                System.out.println("Login successful.");
                return true;
            }
        }
        System.out.println("Invalid username or password.");
        return false;
    }
}

class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

public class Main {
    public static void main(String[] args) {
        AuthenticationSystem authSystem = new AuthenticationSystem();
        // Register User
        authSystem.registerUsers("alice", "password123");
        // Login user
        authSystem.loginUser("alice", "password123");
    }
}
