package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusBeforeLoggingDecorator implements EngineStart {

    private EngineStart engineStarter;

    public CarEngineStatusBeforeLoggingDecorator(final EngineStart engineStarter) {
        this.engineStarter = engineStarter;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine will start in a second");
        engineStarter.startEngine();

    }

    @Override
    public void stopEngine() {
        System.out.println("Engine will stop in  second");
        engineStarter.stopEngine();

    }
}
