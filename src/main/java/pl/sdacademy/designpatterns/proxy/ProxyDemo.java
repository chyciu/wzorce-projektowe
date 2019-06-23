package pl.sdacademy.designpatterns.proxy;

import pl.sdacademy.designpatterns.proxy.security.*;

import java.time.LocalDate;

public class ProxyDemo {

    public static void main(String[] args) {

       // final ConfigLoader configLoader = (ConfigLoader) new DatabaseConfigLoader("jdbc:h2:mem:testdb");

       // configLoader.load();
       // System.out.println("xxx");
       // configLoader.load();
       // System.out.println("xxx");
      //  configLoader.load();

        final Person admin = new Person("Janek", "admin@gmail.com", "2939393939", LocalDate.now(),
                Role.ADMIN, 2, true);
        final Person user = new Person("Mike", "mike@yahoo.com", "464646464", LocalDate.now(),
                Role.USER, 0, false);

        final PersonManager personManager = new PersonManagerProxy(new SinglePersonManager(), user);
        personManager.addPerson(admin);

        personManager.getAllPeople().forEach(System.out :: println);

    }

}
