package functionalprogramming;

import java.util.function.Predicate;

public class FirstFunctionalInterface {

    public static void main(String[] args) {
        //First we want to build a method that checks if the String is empty
        String emptyString = "";
        stringChecker(emptyString);

        //Then we want to check if the string contains the letter 'a', we need another method
        String notSoEmptyString = "abcd";
        stringChecker2(notSoEmptyString);

        //These methods basically do the same: they take a String, check something and return a boolean
        //You could write an interface, then have a class implement the interface and override the method to
        //provide different implementations to check different things

        //...or we create a Functional Interface and use the lambda expression
        checkStringWithInterface(emptyString, s -> s.isEmpty());
        checkStringWithInterface(notSoEmptyString, s -> s.contains("a"));

    }

    public static void stringChecker(String string) {
        System.out.println("String is empty = " + string.isEmpty());
    }

    public static void stringChecker2(String string) {
        System.out.println("String contains the letter 'a' = " + string.contains("a"));
    }

    public static void checkStringWithInterface(String string, StringChecker checker) {
        System.out.println(checker.checkString(string));
    }

}
// Single abstract method (SAM)
interface StringChecker {
    boolean checkString (String s);
}


