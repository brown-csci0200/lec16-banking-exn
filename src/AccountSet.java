package src;

import java.util.LinkedList;

public class AccountSet {
    private LinkedList<Account> accounts = new LinkedList<Account>();

    AccountSet(){}

    public void addAccount(Account newA) {
        this.accounts.addFirst(newA);
    }

    // this method is new -- it creates a helper from the
    // for loops that were in getBalance and withdraw
    public Account findAccount(int forAcctNum) {
        for (Account acct : accounts) {
            if (acct.numMatches(forAcctNum))
                return acct;
        }
        return null;
    }
}
