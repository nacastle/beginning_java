package eKoreatech.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest1_2 {
    public static void main(String[] args) {
        String[] animals = {"cat", "hippo", "giraffe", "elephant", "monkey", " "};
        Arrays.sort(animals, /*정렬 로직*/ new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });  // 글자개수 순서로 정렬


        for (String item : animals) {
            System.out.println(item);
        }
    }
}
