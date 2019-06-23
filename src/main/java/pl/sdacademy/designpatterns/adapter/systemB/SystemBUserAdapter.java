package pl.sdacademy.designpatterns.adapter.systemB;

import pl.sdacademy.designpatterns.adapter.IUser;

import java.util.ArrayList;
import java.util.List;

public class SystemBUserAdapter implements IUser {

    private SystemBUser systemBUser;

    public SystemBUserAdapter (final SystemBUser systemBUser) {
        this.systemBUser = systemBUser;
    }
    @Override
    public String getFullname() {
        return systemBUser.getFirstName() +" "+ systemBUser.getLastName();
    }

    @Override
    public String getUsername() {
        return systemBUser.getLastName();
    }

    @Override
    public int getAge() {
        return Integer.parseInt(systemBUser.getAge());
    }

    @Override
    public List<String> getRoles() {
        return new ArrayList<>(systemBUser.getRoles());
    }
}
