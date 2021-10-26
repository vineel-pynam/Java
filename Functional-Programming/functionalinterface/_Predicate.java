package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Normal Way: ");
        System.out.println(validatePhoneNumber("901112321"));
        System.out.println(validatePhoneNumber("9011123219"));
        System.out.println(validatePhoneNumber("0911123219"));

        System.out.println("Predicate: ");
        System.out.println(validatePhonePredicate.test("9011123213"));

        System.out.println(validatePhonePredicate.and(containsPredicate).test("901112321"));
    }

    static Predicate<String> containsPredicate = phoneNumber ->
            phoneNumber.contains("3");
    static Predicate<String> validatePhonePredicate = phoneNumber ->
            phoneNumber.startsWith("90") && phoneNumber.length() == 10;

    static boolean validatePhoneNumber(String  phoneNumber){
        return phoneNumber.startsWith("90") && phoneNumber.length() == 10;
    }
}
