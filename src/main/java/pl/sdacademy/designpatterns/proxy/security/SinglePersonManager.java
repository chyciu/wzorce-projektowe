package pl.sdacademy.designpatterns.proxy.security;

import java.util.ArrayList;
import java.util.List;

public class SinglePersonManager implements PersonManager {

    private List<Person> users = new ArrayList<>();

    @Override
    public void addPerson(Person person) {
        final boolean emailExists = users.stream().anyMatch(p -> p.getEmail().equalsIgnoreCase(person.getEmail()));
        if (!emailExists) {
            users.add(person);
        } else {
            throw new RuntimeException("User with given email already exists");
        }
    }

    @Override
    public void deletePerson(String email) {
       // final Optional<Person> personToDelate =

        users.stream()
                .filter(p->p.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .ifPresent(p -> users.remove(p));

     //   if (personToDelate.isPresent()) {
       //     users.remove(personToDelate.get());
      //  }

    }

    @Override
    public List<Person> getAllPeople() {
        return users;
    }

    @Override
    public boolean isPersonPresent(String name) {
        return users.stream().anyMatch(p->p.getName().equalsIgnoreCase(name));
    }

    @Override
    public void validateEmail(String email) {
        users.stream()
                .filter(p->p.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .ifPresent(p->p.setVerified(true));
    }
}
