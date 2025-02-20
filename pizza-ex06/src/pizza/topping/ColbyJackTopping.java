package pizza.topping;

public class ColbyJackTopping extends CheeseTopping{
    @Override
    public String toString(){
        return "Colby Jack Topping";
    }

    @Override
    public Double getPrice(){
        return 0.75;
    }
}
