package pizza;

import java.util.ArrayList;
import pizza.crust.PizzaCrust;
import pizza.sauce.PizzaSauce;
import pizza.topping.PizzaTopping;

public class Pizza implements MenuItem{
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private ArrayList<PizzaTopping> toppingList;
    private ArrayList<MenuItem> selectionList;

    public Pizza() {
        this.crust = null;
        this.sauce = null;
        this.toppingList = new ArrayList<PizzaTopping>();
        this.selectionList = new ArrayList<MenuItem>();
    }

    public PizzaCrust getCrust(){
        return this.crust;
    }

    public void setCrust(PizzaCrust crust){
        this.crust = crust;
        this.selectionList.add(crust);
    }
    public PizzaSauce getSauce(){
        return this.sauce;
    }

    public void setSauce(PizzaSauce sauce){
        this.sauce = sauce;
        this.selectionList.add(sauce);
    }

    public ArrayList<PizzaTopping> getTopping(){
        return this.toppingList;
    }

    public void setTopping(ArrayList<PizzaTopping> toppings){
        this.toppingList = toppings;
        this.selectionList.addAll(this.toppingList);
    }

    public void addTopping (PizzaTopping topping){
        this.toppingList.add(topping);
        this.selectionList.add(topping);
    }

    public void display(){
        System.out.println(this.crust.checkIntegrity());
        System.out.println(this.crust.toNiceString());
        System.out.println(this.sauce.toNiceString());
        for (PizzaTopping topping : toppingList){
            System.out.println(topping.toNiceString());
        }
        System.out.println("Total Price: $" + this.getPrice());
    }

    public String getIngredient(){
        return this.crust.getIngredient();
    }

    public void setIngredient(String ingredient){
        this.crust.setIngredient(ingredient);
    }

    /* 
    @Override
    public Double getPrice(){
        Double totalPrice = 0.0;
        totalPrice += this.crust.getPrice();
        totalPrice += this.sauce.getPrice();
        for(PizzaTopping topping : this.toppingList){
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }*/

    @Override
    public Double getPrice(){
        Double totalPrice = 0.0;
        for (MenuItem item : this.selectionList){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}