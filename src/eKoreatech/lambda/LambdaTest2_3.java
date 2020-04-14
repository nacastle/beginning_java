package eKoreatech.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//람다식 표현
public class LambdaTest2_3 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(
                Arrays.asList("cat", "hippo","a","giraffe","elephant", "monkey", " ")
        );

        animals.removeIf((s) -> s.length() < 2); // 람다식 표현

        System.out.println(animals);
    }
}
