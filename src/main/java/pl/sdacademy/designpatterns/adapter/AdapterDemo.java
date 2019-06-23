package pl.sdacademy.designpatterns.adapter;

import pl.sdacademy.designpatterns.adapter.systemA.SystemAUser;
import pl.sdacademy.designpatterns.adapter.systemA.SystemAUserAdapter;
import pl.sdacademy.designpatterns.adapter.systemB.SystemBUser;
import pl.sdacademy.designpatterns.adapter.systemB.SystemBUserAdapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {

        final SystemAUser systemAUser = new SystemAUser("Michał", "Kowal", 30, Collections.singleton("user"));
        final SystemBUser systemBUser = new SystemBUser("Andrzej Nowak", "endriu", "22", Collections.singleton("Admin"));

        final IUser userA = new SystemAUserAdapter(systemAUser);
        final IUser userB = new SystemBUserAdapter(systemBUser);

        List<IUser> users = Arrays.asList(userA, userB);

        System.out.println(userA.getFullname());
        System.out.println(userA.getAge());
        System.out.println(userA.getUsername());
        System.out.println(userA.getRoles());

        System.out.println(userB.getUsername());
        System.out.println(userB.getAge());

    }
}
