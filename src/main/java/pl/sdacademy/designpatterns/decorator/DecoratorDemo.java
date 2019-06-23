package pl.sdacademy.designpatterns.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        //final EngineStart engineStarter = new CarEngineStatusAfterLoggingDecorator(new CarEngineStatusBeforeLoggingDecorator(new Car()));

        final EngineStart engineStarter = new CarEngineStatusBeforeLoggingDecorator(new CarEngineStatusAfterLoggingDecorator(new Car()));

        engineStarter.startEngine();
        engineStarter.stopEngine();



    }
}
