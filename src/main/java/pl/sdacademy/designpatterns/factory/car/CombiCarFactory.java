package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class CombiCarFactory implements AbstractFactory {

    //TC - Toyota Corolla Combi - 2.0 silnik
    //A4 - Audi a4 Combi - 2.5 silnik

    @Override
    public Object create(String type) {
        switch (type) {
            case "TC":
                return createCorollaCombi();
            case "A4":
                return createA4Combi();
        } throw new RuntimeException ("Unknown combi type");

    }

    private Car createCorollaCombi () {
        return new Toyota("Corolla Combi", EngineType.DIESEL, 2.0, 4, BodyType.COMBI);
    }

    private Car createA4Combi () {
        return new Audi("A4 Combi", EngineType.DIESEL, 2.5, 5, BodyType.COMBI);
    }
}
