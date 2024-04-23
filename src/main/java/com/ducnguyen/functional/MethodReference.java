package com.ducnguyen.functional;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReference {

    public static void main(String[] args) {
        // Static method reference
        Function<String, Integer> parseIntFunction = Integer::parseInt;
        int result = parseIntFunction.apply("10");
        System.out.println(result); // 10

        // Instance method reference
        String str = "Hello";
        Predicate<String> startsWithPredicate = str::startsWith;
        boolean predicateResult = startsWithPredicate.test("He");
        System.out.println(predicateResult); // true

        // Arbitrary object method reference
        BiFunction<String, String, Boolean> equalsFunction = String::equals;
        boolean eResult = equalsFunction.apply("hello", "hello");
        System.out.println(eResult); // true
    }
}
