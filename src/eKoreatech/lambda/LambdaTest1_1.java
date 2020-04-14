package eKoreatech.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest1_1 {
    public static void main(String[] args) {
        String[] animals = {"cat", "hippo", "giraffe", "elephant", "monkey", " "};
        AnimalComparator comparator = new AnimalComparator();
        Arrays.sort(animals, /*정렬 로직*/ comparator);  // 글자개수 순서로 정렬


        for (String item : animals) {
            System.out.println(item);
        }
    }

    static class AnimalComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
