package pl.sdacademy.designpatterns.Singleton;

import java.util.HashMap;
import java.util.Map;

public enum UsersRepository {

    INSTANCE;

    Map<String, String> usernamesToEmails = new HashMap<>();

    public Map<String, String> getUsernamesToEmails() {
        return usernamesToEmails;
    }

    public void addUser (String username, String email) {
        if (username != null & email != null) {
            usernamesToEmails.put(username, email);
        } else {
            System.out.println("Users with this email already added");
        }
    }

}
