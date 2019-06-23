package pl.sdacademy.designpatterns.decorator;

public class Car implements EngineStart {

    private boolean engineStarted;

    @Override
    public void startEngine() {
        engineStarted = true;

    }

    @Override
    public void stopEngine() {
        engineStarted = false;

    }
}
