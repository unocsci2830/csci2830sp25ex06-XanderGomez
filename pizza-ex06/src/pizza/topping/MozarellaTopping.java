package pizza.topping;

public class MozarellaTopping extends CheeseTopping{
    @Override
    public String toString(){
        return "Mozarella Topping";
    }

    @Override
    public Double getPrice(){
        return 1.5;
    }
}
