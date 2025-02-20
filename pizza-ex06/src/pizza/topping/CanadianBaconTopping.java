package pizza.topping;

public class CanadianBaconTopping extends MeatTopping{
    @Override
    public String toString(){
        return "Canadian Bacon Topping";
    }

    @Override
    public Double getPrice(){
        return 1.5;
    }
}
