package pizza.crust;

public class ThickCrust extends PizzaCrust {
    private Boolean deepDish;

    public ThickCrust(){
        deepDish = false;
    }

    @Override
    public String toString(){
        if(deepDish){
            return "Deep Dish Crust";
        }
        return "Thick Crust";
    }

    @Override
    public String checkIntegrity(){
        if(this.ingredient == "Cauliflower"){
            return "Warning: Handle Pizza Carefully. Possibility of Pizza Falling Apart!";
        }
        return "";
    }

    public void setDeepDish(){
        this.deepDish = true;
    }

    @Override
    public Double getPrice(){
        if (deepDish){
            return 2.0;
        }
        return 1.0;
    }
}
