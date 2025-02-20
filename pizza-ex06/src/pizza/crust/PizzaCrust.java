package pizza.crust;

import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
    protected String ingredient;

    public PizzaCrust() {
        this.ingredient = "";
    }

    public abstract String toString();

    public String toNiceString() {
        if (this.ingredient == "Cauliflower"){
            Double price = this.getPrice() + 1;
            return "Crust: " + this.ingredient + " " + this.toString() + " $" + price;
        }
        return "Crust: " + this.ingredient + " " + this.toString() + " $" + this.getPrice();
    }

    public String getIngredient(){
        return this.ingredient;
    }

    public void setIngredient(String ingredient){
        this.ingredient = ingredient;
    }

    public String checkIntegrity(){
        return "";
    }

    @Override
    public Double getPrice(){
        return 1.0;
    }
}
