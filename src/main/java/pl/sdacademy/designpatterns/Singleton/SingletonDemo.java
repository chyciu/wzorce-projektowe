package pl.sdacademy.designpatterns.Singleton;

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
    }
}
