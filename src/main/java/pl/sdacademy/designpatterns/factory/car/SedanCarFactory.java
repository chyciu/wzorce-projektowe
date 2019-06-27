package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class SedanCarFactory implements AbstractFactory<Car> {

    //TC - Toyota Corolla sedan
    // A4 - Audi a4 sedan

    @Override
    public Car create(String type) {
        switch (type) {
            case "TC":
                return createCorollaSedan();
            case "A4":
                return createA4Sedan();
        }
        throw new RuntimeException("Unknown sedan type");
    }

    private Car createCorollaSedan () {
        return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,
                1.60, 4, BodyType.SEDAN);
    }

    private Car createA4Sedan () {

        return new Audi("A4", EngineType.DIESEL, 2.00, 4, BodyType.SEDAN);
    }

}
