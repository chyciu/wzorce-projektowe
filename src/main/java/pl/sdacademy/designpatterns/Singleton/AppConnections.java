package pl.sdacademy.designpatterns.Singleton;

import java.util.ArrayList;
import java.util.List;

public class AppConnections {

    // Singleton klasy Lazy

    private List<String> connectedUsers;
    private long timeout;
    private int currentConnectionsNum = 0;


   //poniżej trzy elementy wzoca Singleton: obiekt, konstruktor, metoda.

    private static AppConnections appConnections;

    public static AppConnections getInstance() {
        if (appConnections == null) {
            appConnections = new AppConnections();
            System.out.println("Initialized AppConnections");
        }
        return appConnections;
    }

    private AppConnections () {
        connectedUsers = new ArrayList<>();

    }

    public List<String> getConnectedUers() {
        return connectedUsers;
    }

    public long getTimeout() {
        return timeout;
    }

    public int getCurrentConnectionsNum() {
        return currentConnectionsNum;
    }

    public static AppConnections getAppConnections() {
        return appConnections;
    }

    public void connectUsers (final String username) {
        connectedUsers.add(username);
    }


}
