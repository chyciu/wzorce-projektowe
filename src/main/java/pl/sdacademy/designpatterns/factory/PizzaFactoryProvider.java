package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.pizza.Pizza;
import pl.sdacademy.designpatterns.factory.pizza.PizzaItaliaFactory;
import pl.sdacademy.designpatterns.factory.pizza.PizzaType;

public class PizzaFactoryProvider {

    public static AbstractFactory <Pizza> getFactory (final PizzaType pizzaType) {

        switch (pizzaType) {
            case MARGARITA:
                return new PizzaItaliaFactory();
            case DIABOLO:
                return new PizzaItaliaFactory();
        }
        throw new RuntimeException("Unknown pizza type");
    }
}
