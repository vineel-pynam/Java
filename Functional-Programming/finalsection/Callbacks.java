package finalsection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("Vineel",
                "Pynam",
                value -> System.out.println("no lastname provided for " + value)
        );

        hello2("Vineel",
                null,
                () -> System.out.println("no lastname provided")
        );
    }

    static void hello(String firstname, String lastname, Consumer<String> callback){
        System.out.println(firstname);
        if( lastname == null ){
            callback.accept(firstname);
        }else{
            System.out.println(lastname);
        }
    }

    static void hello2(String firstname, String lastname, Runnable callback){
        System.out.println(firstname);
        if( lastname == null ){
            callback.run();
        }else{
            System.out.println(lastname);
        }
    }
}
