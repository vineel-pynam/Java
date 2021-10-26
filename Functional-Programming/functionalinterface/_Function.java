package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // FUNCTION takes one argument
        System.out.println("Function: ");
        int increment = increment(1);
        System.out.println(increment);

        Integer increment2 = incrementByOne.apply(1);
        System.out.println(increment2);

        Integer multiplyBy10 = multiplyBy10Function.apply(1);
        System.out.println(multiplyBy10);

        Function<Integer, Integer> IncrementByOneAndMultiplyBy10 = incrementByOne.andThen(multiplyBy10Function);
        System.out.println(IncrementByOneAndMultiplyBy10.apply(2));


        // BiFunction takes 2 arguments
        System.out.println("\nBi Function: ");
        int doubleParameterFunction = incrementBYOneAndMultiplyBY10(11, 10);
        System.out.println(doubleParameterFunction);

        Integer BiFunctionUse = incrementAndMultiplyBiFunction.apply(5, 10);
        System.out.println(BiFunctionUse);
    }
    
    static Function<Integer, Integer> incrementByOne = number -> number+1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number*10;

    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyBiFunction =
            (num1, num2) -> (num1+1) * num2;

    static int increment(int number){
        return number+1;
    }
    static int incrementBYOneAndMultiplyBY10(int num1, int num2){
        return (num1+1) * num2;
    }
}
