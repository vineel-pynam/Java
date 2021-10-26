package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        System.out.println("Normal Way: ");
        Customer vineel = new Customer("Vineel", 101011);
        greetCustomer(vineel);

        System.out.println("Using Consumer: ");
        greetCustomerConsumer.accept(vineel);
        greetCustomerBiConsumer.accept(vineel, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, aBoolean) ->
            System.out.println("Hello " +
                    customer.CustomerName + " thanks for registering phone number "
                    + ( aBoolean ? customer.CustomerPhoneNumber : "****") );

    static Consumer<Customer> greetCustomerConsumer = customer ->  System.out.println("Hello " +
            customer.CustomerName + " thanks for registering phone number "
            + customer.CustomerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.CustomerName + " thanks for registering phone number "
                + customer.CustomerPhoneNumber);
    }

    static class Customer{
        private final String CustomerName;
        private final int CustomerPhoneNumber;

        public Customer(String customerName, int customerPhoneNumber) {
            CustomerName = customerName;
            CustomerPhoneNumber = customerPhoneNumber;
        }
    }
}
