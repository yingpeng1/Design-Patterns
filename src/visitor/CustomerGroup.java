package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构，可以是组合结构，或者是一个集合
 */
public class CustomerGroup {

    private List<Customer> customers = new ArrayList<>();

    void accept(Visitor visitor){
        for (Customer customer : customers){
            customer.accept(visitor);
        }
    }

    void addCustomer(Customer customer){
        customers.add(customer);
    }
}
