package pl.sdacademy.designpatterns.factory.pizza;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class PizzaItaliaFactory implements AbstractFactory {

    //VEG = pizza vega
    //MAR = pizza margarita
    //DIA = pizza diabolo

    @Override
    public Object create(String type) {
        switch (type) {
            case "VEG":
                return createVega();
            case "MAR":
                return createMargatita();
            case "DIA":
                return createDiabolo();

        } throw new RuntimeException ("We have no such pizza in our offer");
    }

    private Pizza createVega () {
        return new Vega (PizzaType.VEGA, PizzaAdds.CHEESE, PizzaAdds.DOUGH, PizzaAdds.ONION,23, 10);
    }

    private Pizza createDiabolo () {
        return new Diabolo(PizzaType.DIABOLO, PizzaAdds.DOUGH, PizzaAdds.PAPRIKA, PizzaAdds.SALAMI, 30, 15);
    }

    private Pizza createMargatita () {
        return new Margarita(PizzaType.MARGARITA, PizzaAdds.DOUGH, PizzaAdds.ONION, PizzaAdds.CHEESE, 45, 20);
    }
}
