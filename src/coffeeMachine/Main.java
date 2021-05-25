package coffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the drink first char and count of sugar");
        Command command = new Command(scanner.next());
        command.makeDrink();
    }
}
