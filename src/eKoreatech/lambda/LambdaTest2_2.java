package eKoreatech.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest2_2 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(
                Arrays.asList("cat", "hippo","a","giraffe","elephant", "monkey", " ")
        );

        animals.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 2;
            }
        });

        System.out.println(animals);
    }
}
