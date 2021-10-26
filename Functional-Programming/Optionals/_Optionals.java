package Optionals;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "Default Value");

        System.out.println(value);
    }
}
