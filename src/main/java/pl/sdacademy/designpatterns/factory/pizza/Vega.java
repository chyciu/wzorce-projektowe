package pl.sdacademy.designpatterns.factory.pizza;

public class Vega implements Pizza {

    private PizzaType pizzaName;
    private PizzaAdds pizzaAdds1;
    private PizzaAdds pizzaAdds2;
    private PizzaAdds pizzaAdds3;
    private int pizzaDiameter;
    private int pizzaNumber;


    public Vega(PizzaType pizzaName, PizzaAdds pizzaAdds1, PizzaAdds pizzaAdds2, PizzaAdds pizzaAdds3, int pizzaDiameter, int pizzaNumber) {
        this.pizzaName = pizzaName;
        this.pizzaAdds1 = pizzaAdds1;
        this.pizzaAdds2 = pizzaAdds2;
        this.pizzaAdds3 = pizzaAdds3;
        this.pizzaDiameter = pizzaDiameter;
        this.pizzaNumber = pizzaNumber;
    }

    @Override
    public String getPizzaName() {
        return "Pizza" + pizzaName;
    }

    @Override
    public PizzaAdds getPizzaAdds() {
        return pizzaAdds1;
    }

    @Override
    public int getPizzaDiameter() {
        return pizzaDiameter;
    }

    @Override
    public int getPizzaNumber() {
        return pizzaNumber;
    }


}
