package pl.sdacademy.designpatterns.adapter.systemA;

import pl.sdacademy.designpatterns.adapter.IUser;

import java.util.List;

public class SystemAUserAdapter implements IUser {

    private SystemAUser systemAUser;

    public SystemAUserAdapter (final SystemAUser systemAUser) {
        this.systemAUser = systemAUser;
    }

    @Override
    public String getFullname() {
        return systemAUser.getFullName();
    }

    @Override
    public String getUsername() {
        return systemAUser.getDisplayName();
    }

    @Override
     public int getAge() {
         return (int)systemAUser.getAge();
     }

    @Override
    public List<String> getRoles() {
        return (List<String>) systemAUser.getRoles();
    }
}
