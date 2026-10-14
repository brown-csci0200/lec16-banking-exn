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
        try {
            // FROM CLASS: ...now the view can decide what to do if there is no such customer.

            // FROM CLASS: normal path will execute this entire "try" block
            controller.login(username, password);
            // FROM CLASS: if exception happens, it gets caught _before_ this point, no println.
            System.out.println("Thanks for logging in!");
        } catch(NoSuchCustomerException e) {
            //  FROM CLASS: exception skips here once caught
            //  FROM CLASS: (this is only an example of what the view could do)
            loginScreen();
        }
    }
}
