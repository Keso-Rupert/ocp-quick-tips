package functionalprogramming;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FirstLambda {

    /*
    A lambda expression is a piece of code that is passed as a parameter in a method.
    It is used when you want the caller of the method to decide what functionality to perform.
    It allows us to write code that can be used in endless different ways and it's very powerful.
     */

    // Before we dive in, here's an example:
    public static void main(String[] args) {
        List<Integer> reportCard = List.of(10, 8, 7, 3, 10);

        for(int i : reportCard){
            System.out.println(i);
        }

        reportCard.stream()
                .forEach(System.out::println);

    }

    /* Valid ways of writing lambda's: */

    // Shortest form
    Predicate<String> lambdaExample = x -> x.isEmpty();

    // Once you add a type or another parameter, parentheses are required:
    Predicate<String> lambdaExample2 = (String x) -> x.isEmpty();
    BiPredicate<String, String> lambdaExample3 = (x, y) -> x.equals(y); // You can list both types: (String x, String y)

    // The part after -> is just a block of code and can contain just one line. Once you add more lines of code, you
    // have to add parentheses. Once parentheses are there, a return statement and a ';' are required as well:
    Predicate<String> lambdaExample4 = (String x) -> {
        //... you can write more code here
        return x.isEmpty();
    }; // Notice both semicolons here.


}
