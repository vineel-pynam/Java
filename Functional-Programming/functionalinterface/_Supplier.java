package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(connectToDB());
        System.out.println(connectSupplier.get());
    }

    static Supplier<String> connectSupplier = () -> "https://localhost";

    static String connectToDB(){
        return "https://localhost";
    }

}
