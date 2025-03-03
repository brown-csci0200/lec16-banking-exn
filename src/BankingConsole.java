package src;

import java.util.Scanner;

public class BankingConsole {
    private BankingService controller;

    BankingConsole(BankingService b) {
        this.controller = b;
    }

    public void showBalance(int acctID) {
        System.out.println(controller.getBalance(acctID));
    }

    public double withdraw(int acctID, double amt) {
        return controller.withdraw(acctID, amt);
    }

    public void loginScreen() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Bank.  Please log in.");
        System.out.print("Enter your username: ");
        String username = keyboard.next();
        System.out.print("Enter your password: ");
        String password = keyboard.next();
        controller.login(username, password);
        System.out.println("Thanks for logging in!");
    }
}
