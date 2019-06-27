package pl.sdacademy.designpatterns.factory.pizza;

import pl.sdacademy.designpatterns.factory.AbstractFactory;
import pl.sdacademy.designpatterns.factory.PizzaFactoryProvider;

public class PizzaDemo {

    public static void main(String[] args) {

        final PizzaType pizzaType = PizzaType.DIABOLO;

        final AbstractFactory<Pizza> factory = PizzaFactoryProvider.getFactory(pizzaType);

        final Pizza pizza = factory.create("DIA");

        System.out.println(pizza.getPizzaName());
        System.out.println(pizza.getPizzaDiameter());
        System.out.println(pizza.getPizzaAdds());

    }


}
