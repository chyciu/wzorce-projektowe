package pl.sdacademy.designpatterns.observer;

public class ConcreteValueObserver  extends Observer {

    public ConcreteValueObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Subcject value changed and is now "+ subject.getValue());
    }


}
