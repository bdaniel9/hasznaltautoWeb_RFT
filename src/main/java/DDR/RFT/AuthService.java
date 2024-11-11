package DDR.RFT;

import java.util.ArrayList;
import java.util.List;

public class AuthService {
    private List<User> users = new ArrayList<>();

    public AuthService() {
        users.add(new User("user1", "password1"));
        users.add(new User("admin", "admin"));
        users.add(new User("DDR", "DDR"));
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true; // Sikeres bejelentkezés
            }
        }
        return false; // Sikertelen bejelentkezés
    }

}
