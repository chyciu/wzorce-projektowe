package pl.sdacademy.designpatterns.command;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    List<UserData> userData = new ArrayList<>();

    public void addUser (final UserData user) {
        userData.add(user);
    }

    public void removeuser (final UserData user) {
        userData.remove(user);
    }

    public List<UserData> getUserData() {
        return userData;
    }
}
