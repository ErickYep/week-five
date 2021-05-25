package coffeeMachine;

public class Command {
    private char drink;
    private int sugar;
    private boolean stick;

    Command(String str){
        drink = str.charAt(0);
        sugar = Integer.parseInt("" + str.charAt(2));
        if(sugar>0){
            stick = true;
        }
    }

    public char getDrink() {
        return drink;
    }

    public void setDrink(char drink) {
        this.drink = drink;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    void giveCup(){
        System.out.print("Cup + ");
    }

    void makeDrink(){
        switch(drink) {
            case 'T':
                System.out.print("Tea");
                break;
            case 'C':
                System.out.print("Coffee");
                break;
            case 'S':
                System.out.print("Chocolate");
                break;
        }
        if(stick == false)
            System.out.print(" with No Sugar");
        else{
            System.out.println(" with " + sugar + " sugar + stick");
        }

    }
}
