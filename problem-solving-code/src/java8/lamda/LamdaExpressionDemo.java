package java8.lamda;

import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaExpressionDemo {
    public static void main(String arg[]){
        int j=5;
        Predicate<Integer>  p = i -> i%2 == 0;

        Predicate<String> stringPredicate = str -> str.equals("dev");

        Function<String,String> stringStringFunction = str ->{
            return str+"dev";
        };
        System.out.println(p.test(4));
        System.out.println(stringPredicate.test("dev"));
        System.out.println(stringStringFunction.apply("dev"));
    }
}
