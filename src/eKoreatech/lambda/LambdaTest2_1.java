package eKoreatech.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest2_1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(
                Arrays.asList("cat", "hippo","a","giraffe","elephant", "monkey", " ")
        );
        AnimalPredicate animalPredicate = new AnimalPredicate();
        animals.removeIf(/*remove하고싶은 로직*/ animalPredicate);

        System.out.println(animals);
    }

    static class AnimalPredicate implements Predicate<String> {
        @Override
        public boolean test(String s) {
            return s.length() < 2;   // 글자수가 2글자 미만인 것들은 true 값으로 나타남
        }
    }
}
