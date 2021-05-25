package coffeeMachine2;

import coffeeMachine2.models.DrinkType;

public class Command {
    private DrinkType drinkType;
    private int sugarCount;

    public Command(String input){
        String[] split = input.split(":");
        switch(split[0]){
            case "T":
                drinkType = DrinkType.TEA;
                break;
            case"C":
                drinkType = DrinkType.COFFEE;
                break;
            case "S":
                drinkType = DrinkType.CHOCOLATE;
                break;
        }
        sugarCount = Integer.parseInt(split[1]);
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }

}
