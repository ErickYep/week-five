package coffeeMachine2;

import coffeeMachine2.models.*;

public class CoffeeMachine {


    public Cup getProduct(Command command) {

        return initializeProduct(command);
    }

    public Cup initializeProduct(Command command) {
        Cup cup = new Cup();
        getStick(command, cup);
        getSugar(command, cup);
        getDrink(command, cup);

        return cup;
    }
























    private void getDrink(Command command, Cup cup) {
        if(command.getDrinkType() == DrinkType.CHOCOLATE) {
            cup.setDrink(new Chocolate());
        }
        if(command.getDrinkType() == DrinkType.COFFEE) {
            cup.setDrink(new Coffee());
        }
        if(command.getDrinkType() == DrinkType.TEA) {
            cup.setDrink(new Tea());
        }
    }

    private void getSugar(Command command, Cup cup) {
        if (command.getSugarCount() > 0) {
            Sugar[] sugars = new Sugar[command.getSugarCount()];
            for (int i = 0; i < sugars.length; i++) {
                sugars[i] = new Sugar();
            }
            cup.setSugars(sugars);
        }
    }

    private void getStick(Command command, Cup cup) {
        if (command.getSugarCount() > 0) {
            cup.setStick(new Stick());
        }
    }
}
