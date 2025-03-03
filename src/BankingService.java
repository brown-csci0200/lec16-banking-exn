package src;

public class BankingService {
    private AccountSet accounts;
    private CustomerSet customers;

    public BankingService(AccountSet al, CustomerSet cl) {
        this.accounts = al;
        this.customers = cl;
    }

    public double getBalance(int forAcctNum) {
        return accounts.findAccount(forAcctNum).getBalance();
    }

    public double withdraw(int forAcctNum, double amt) {
        return accounts.findAccount(forAcctNum).withdraw(amt);
    }

    public String login(String custname, String withPwd) {
        Customer cust = customers.findCustomer(custname);
        if (cust.checkPwd(withPwd)) {
            return "Welcome";
        } else {
            return "Try Again";
        }
    }
}
