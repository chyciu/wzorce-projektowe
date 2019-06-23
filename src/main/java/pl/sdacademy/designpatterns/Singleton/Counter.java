package pl.sdacademy.designpatterns.Singleton;

public class Counter {

    // Singleton klasy Eager

    private static Counter counter = new Counter();
    private int value = 0;

    public static Counter getInstance() {
        return counter;
    }

    private Counter () {

    }

    public void addOne () {
        value++;
        System.out.println("Value is now: " + value);
    }

    public void addTwo () {
        value+=2;
        System.out.println("Value increased by 2 and is now: " + value);
    }

    public void addThree () {
        value+=3;
        System.out.println("value increased by 3 and is now: " + value);
    }
}
