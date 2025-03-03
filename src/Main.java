package src;
public class Main {

    public static void main(String[] args) {
        // set up components (options would be chosen here)
        AccountSet accounts = new AccountSet();    // part of model
        CustomerSet customers = new CustomerSet(); // part of model
        BankingService controller = new BankingService(accounts, customers);
        BankingConsole view = new BankingConsole(controller);

        // set up initial data in the model
        Customer kCust = customers.addCustomer("kathi", "cs200");
        int kAcctNum = 1;
        Account kAcct = new Account(kAcctNum, kCust, 150);
        kCust.addAccount(kAcct);

        // interact with the bank
        view.loginScreen();
        view.showBalance(kAcctNum);
        view.withdraw(kAcctNum, 30);
        view.showBalance(kAcctNum);
    }
}
