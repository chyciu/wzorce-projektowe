package pl.sdacademy.designpatterns.command;

public class CommandDemo {

    public static void main(String[] args) {

        final UserRepository userRepository = new UserRepository();

        final UserData userA = new UserData("agag@gmail.com", "Andrzej", " Nowak", "Nowak123");
        final UserData userB = new UserData("agag@gmail.com", "Bogdan", "Linda", "hahaha");
        final UserData userC = new UserData("hdhdh@yahoo.com", "Nina", "Lama", "292929");

        final CommandBase commandA = new UserRegisstractionCommand(userRepository, userA);
        final CommandBase commandB = new UserRegisstractionCommand(userRepository, userB);
        final CommandBase commandC = new UserRegisstractionCommand(userRepository, userC);

        commandA.execute();
        commandA.execute();
        commandA.undo();
        commandA.execute();
        commandA.undo();
        commandB.execute();
        commandA.execute();
        commandC.execute();

        userRepository.getUserData().forEach(user-> System.out.println(user.getSurname()));

    }

}
