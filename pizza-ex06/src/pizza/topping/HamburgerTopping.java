package pizza.topping;

public class HamburgerTopping extends MeatTopping{
    @Override
    public String toString(){
        return "Hamburger Topping";
    }

    @Override
    public Double getPrice(){
        return 1.0;
    }
}
