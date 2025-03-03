package src;
import java.util.LinkedList;

public class CustomerSet {
    private LinkedList<Customer> customers;

    public Customer addCustomer(String username, String pwd) {
        Customer newC = new Customer(username, pwd);
        customers.add(newC);
        return newC;
    }

    public Customer findCustomer(String custname) {
        for (Customer cust:customers) {
            if (cust.nameMatches(custname)) {
                return cust;
            }
        }
        return null; // was return "Oops -- don't know this customer"
    }
}
