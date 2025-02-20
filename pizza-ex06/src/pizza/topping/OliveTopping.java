package pizza.topping;

public class OliveTopping extends VeggieTopping{
    @Override
    public String toString(){
        return "Olive Topping";
    }

    @Override
    public Double getPrice(){
        return 1.0;
    }
}
