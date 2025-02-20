package pizza;

import java.util.Scanner;
import pizza.topping.*;
import pizza.crust.*;
import pizza.sauce.*;

public class PizzaMain {
    private Scanner scanner;
    private Pizza pizza;

    public PizzaMain(){
        scanner = new Scanner(System.in);
        pizza = new Pizza();
    }

    private void inputCrustChoice(){
        System.out.println("What kind of crust would you like: ");
        System.out.println("1 - Thin Crust");
        System.out.println("2 - Thick Crust");

        while (true){
            Integer choice = scanner.nextInt();
            if (choice == 1){
                pizza.setCrust(new ThinCrust());
                break;
            } else if (choice == 2){
                pizza.setCrust(new ThickCrust());
                break;
            } else{
                System.out.println("Pick between 1 and 2");
            }
        }
        System.out.println("Your Choice: " + pizza.getCrust() + "\n");

        System.out.println("What ingredient of crust would you like?: ");
        System.out.println("1 - Flour Crust");
        System.out.println("2 - Cauliflower Crust");

        while (true){
            Integer choice = scanner.nextInt();
            if (choice == 1){
                pizza.setIngredient("Flour");
                break;
            } else if (choice == 2){
                pizza.setIngredient("Cauliflower");
                break;
            } else{
                System.out.println("Pick between 1 and 2");
            }
        }
        System.out.println("Your Choice: " + pizza.getIngredient() + "\n");

        if(pizza.getCrust() instanceof ThickCrust){
            System.out.println("Would you like a Deep Dish Thick Crust?: ");
            System.out.println("1 - Yes");
            System.out.println("2 - No");

            while (true){
                Integer choice = scanner.nextInt();
                if (choice == 1){
                    ((ThickCrust) pizza.getCrust()).setDeepDish();
                    System.out.println("Your Choice: Deep Dish" + "\n");
                    break;
                } else if (choice == 2){
                    System.out.println("Your Choice: Regular Thick Crust" + "\n");
                    break;
                } else{
                    System.out.println("Pick between 1 and 2");
                }
            }
            System.out.println("Your Choice: Deep Dish" + "\n");
        }
    }

    private void inputSauceChoice(){
        System.out.println("What kind of sauce would you like: ");
        System.out.println("1 - Tomato Sauce");
        System.out.println("2 - Alfredo Sauce");

        while(true){
            Integer choice = scanner.nextInt();
            if (choice == 1){
                pizza.setSauce(new TomatoSauce());
                break;
            } else if (choice == 2){
                pizza.setSauce(new AlfredoSauce());
                break;
            } else{
                System.out.println("Pick between 1 and 2");
            }
        }
        System.out.println("Your Choice: " + pizza.getSauce() + "\n");
    }

    private void inputToppingChoices(){
        System.out.println("How many toppings would you like (0-4)?");
        Integer num_toppings;
        while(true){
            num_toppings = scanner.nextInt();
            if (num_toppings < 5 && num_toppings > -1){
                break;
            }
            System.out.println("You can only pick between 0 and 4 toppings");
        }

        Integer topping;
        for (Integer i = 0; i < num_toppings; i++){
            System.out.println("Choose your topping: ");
            System.out.println("1 - Sausage");
            System.out.println("2 - Pepperoni");
            System.out.println("3 - Hamburger");
            System.out.println("4 - Canadian Bacon");
            System.out.println("5 - Olive");
            System.out.println("6 - Scallion");
            System.out.println("7 - Mushroom");
            System.out.println("8 - Onion");
            System.out.println("9 - Mozarella");
            System.out.println("10 - Parmesan");
            System.out.println("11 - Cheddar");
            System.out.println("12 - Colby Jack");

            while(true){
                topping = scanner.nextInt();
                if (topping == 1){
                    pizza.addTopping(new SausageTopping());
                    break;
                } else if (topping == 2){
                    pizza.addTopping(new PepperoniTopping());
                    break;
                } else if (topping == 3){
                    pizza.addTopping(new HamburgerTopping());
                    break;
                } else if (topping == 4){
                    pizza.addTopping(new CanadianBaconTopping());
                    break;
                } else if (topping == 5){
                    pizza.addTopping(new OliveTopping());
                    break;
                } else if (topping == 6){
                    pizza.addTopping(new ScallionTopping());
                    break;
                } else if (topping == 7){
                    pizza.addTopping(new MushroomTopping());
                    break;
                } else if (topping == 8){
                    pizza.addTopping(new OnionTopping());
                    break;
                } else if (topping == 9){
                    pizza.addTopping(new MozarellaTopping());
                    break;
                } else if (topping == 10){
                    pizza.addTopping(new ParmesanTopping());
                    break;
                } else if (topping == 11){
                    pizza.addTopping(new CheddarTopping());
                    break;
                } else if (topping == 12){
                    pizza.addTopping(new ColbyJackTopping());
                    break;
                } else {
                    System.out.println("Please pick a valid option (1-12)");
                }
            }
        }
        
        System.out.println("\nYour choices: " + pizza.getTopping() + "\n");
        
    }

    private void showPizza(){
        pizza.display();
        System.out.println("\n");
    }

    private void runPM(){
        inputCrustChoice();
        inputSauceChoice();
        inputToppingChoices();
        showPizza();
    }

    static public void main(String[] args){
        PizzaMain runner = new PizzaMain();
        runner.runPM();
    }
}
