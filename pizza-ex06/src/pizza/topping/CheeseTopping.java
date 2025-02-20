package pizza.topping;

public class CheeseTopping extends PizzaTopping {
    public String toString() {
        return "Cheese Topping";
    }

    @Override
    public Double getPrice(){
        return 1.0;
    }
}
