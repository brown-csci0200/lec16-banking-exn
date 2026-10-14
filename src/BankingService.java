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

    public String login(String custname, String withPwd) throws NoSuchCustomerException {
        Customer cust = customers.findCustomer(custname);
        // FROM CLASS: what if cust == null ?
        // FROM CLASS: ...the view is in a better position to decide what to do here,
        //    since "no such user" might impact UI behavior.
        //    So the controller lets the exception propagate.
        if (cust.checkPwd(withPwd)) {
            return "Welcome";
        } else {
            return "Try Again";
        }
    }
}
