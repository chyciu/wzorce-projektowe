package pl.sdacademy.designpatterns.factory.pizza;

public class Diabolo implements Pizza {

    private PizzaType pizzaName;
    private PizzaAdds pizzaAdds1;
    private PizzaAdds pizzaAdds2;
    private PizzaAdds pizzaAdds3;
    private int pizzaDiameter;
    private int pizzaNumber;

    public Diabolo(final PizzaType pizzaName, final PizzaAdds pizzaAdds1, final PizzaAdds pizzaAdds2,
                   final PizzaAdds pizzaAdds3, final int pizzaDiameter, final int pizzaNumber)
    {
        this.pizzaName = pizzaName;
        this.pizzaAdds1 = pizzaAdds1;
        this.pizzaAdds2 = pizzaAdds2;
        this.pizzaAdds3 = pizzaAdds3;
        this.pizzaDiameter = pizzaDiameter;
        this.pizzaNumber = pizzaNumber;
    }

    @Override
    public String getPizzaName() {
        return null;
    }

    @Override
    public PizzaAdds getPizzaAdds() {
        return null;
    }

    @Override
    public int getPizzaDiameter() {
        return 0;
    }

    @Override
    public int getPizzaNumber() {
        return 0;
    }
}
