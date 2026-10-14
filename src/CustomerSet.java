package src;
import java.util.LinkedList;

public class CustomerSet {
    private LinkedList<Customer> customers;

    public CustomerSet() {
        this.customers = new LinkedList<Customer>();
    }

    public Customer addCustomer(String username, String pwd) {
        Customer newC = new Customer(username, pwd);
        customers.add(newC);
        return newC;
    }

    public Customer findCustomer(String custname) throws NoSuchCustomerException {
        for (Customer cust:customers) {
            if (cust.nameMatches(custname)) {
                return cust;
            }
        }
        // FROM CLASS: ...the model reports that there is no such customer in an informative way...
        throw new NoSuchCustomerException();
        // return null; // was return "Oops -- don't know this customer"
    }
}
