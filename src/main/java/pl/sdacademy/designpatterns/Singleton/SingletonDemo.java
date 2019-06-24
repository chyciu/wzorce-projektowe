package pl.sdacademy.designpatterns.Singleton;

import pl.sdacademy.designpatterns.command.UserRepository;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

public class SingletonDemo {


    public static void main(String[] args) {
       final Counter counterA = Counter.getInstance();
       final Counter counterB = Counter.getInstance();

        counterA.addOne();
        counterA.addThree();
        counterB.addTwo();
        counterB.addThree();

        final AppConnections appConnectionsA = AppConnections.getAppConnections();
        final AppConnections appConnectionsB = AppConnections.getAppConnections();

      //  appConnectionsA.connectUsers("Andrzej");
      //  appConnectionsB.connectUsers("Michał");

     //   appConnectionsA.getConnectedUers().forEach(System.out :: println);

        final EnumSingleton enumSingletonA = EnumSingleton.INSTANCE;
        final EnumSingleton enumSingletonB = EnumSingleton.INSTANCE;

        FBRegistrationService fbRegistrationService = new FBRegistrationService();
        fbRegistrationService.register("Jerzy", "ggg@gmail.com");
        fbRegistrationService.register("Kamil", "jjj@yahoo.com");
        fbRegistrationService.register("Ola", "ola@onet.pl");

        final UsersRepository usersRepository = UsersRepository.INSTANCE;
        usersRepository.addUser("Jerzy", "gg@gamil.com");
        usersRepository.addUser("Ola", "ola@onet.pl");
        usersRepository.addUser("Monika", "mona@yahoo.com");

        System.out.println(usersRepository.usernamesToEmails);




    }
}
