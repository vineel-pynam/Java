package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Vineel Pynam",
                "vineel@example.com",
                "9199299929",
                LocalDate.of(2000, 1, 1)
        );

//        System.out.println(new CustomerServiceValidator().isValid(customer));
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if( result != SUCCESS ){
            throw new IllegalStateException(result.name());
        }
    }

}
