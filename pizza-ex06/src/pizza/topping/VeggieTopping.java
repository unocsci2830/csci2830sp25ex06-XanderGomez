package pizza.topping;

public class VeggieTopping extends PizzaTopping {
    public String toString() {
        return "Veggie Topping";
    }

    @Override
    public Double getPrice(){
        return 1.0;
    }
}
