package pl.sdacademy.designpatterns.command;

public class UserRegisstractionCommand  implements CommandBase {

    private UserRepository userRepository;
    private UserData user;

    public UserRegisstractionCommand(final UserRepository userRepository, final UserData user) {
        this.userRepository = userRepository;
        this.user = user;
    }

    @Override
    public void execute() {
       final boolean mailExists =  userRepository.getUserData().stream()
                .anyMatch(ud->ud.getEmail().equalsIgnoreCase(user.getEmail()));
       if (!mailExists) {
           userRepository.addUser(user);
       }

    }

    @Override
    public void undo() {
        userRepository.removeuser(user);

    }
}
