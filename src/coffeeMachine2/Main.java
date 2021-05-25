package coffeeMachine2;

import coffeeMachine2.models.Cup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Command command = new Command(scanner.next());
        Cup product = coffeeMachine.getProduct(command);
        System.out.println(product);

    }
}
