package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusAfterLoggingDecorator implements EngineStart {

    private EngineStart engineStarter;

    public CarEngineStatusAfterLoggingDecorator(final EngineStart engineStarter) {
        this.engineStarter = engineStarter;
    }

    @Override
    public void startEngine() {
        engineStarter.startEngine();
        System.out.println("Engine is started");

    }

    @Override
    public void stopEngine() {
        engineStarter.startEngine();
        System.out.println("Engine is stopped");

    }
}
