package pizza.topping;

public class ScallionTopping extends VeggieTopping{
    @Override
    public String toString(){
        return "Scallion Topping";
    }

    @Override
    public Double getPrice(){
        return 1.5;
    }
}
