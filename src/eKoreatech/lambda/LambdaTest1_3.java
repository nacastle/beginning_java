package eKoreatech.lambda;

import java.util.Arrays;
import java.util.Comparator;

// 람다 활용 케이스: 람다식은 함수형 인터페이스를 축약한 문법이며, 함수형 인터페이스를 지원하는 강력한 기능이다.
public class LambdaTest1_3 {
    public static void main(String[] args) {
        String[] animals = {"cat", "hippo", "giraffe", "elephant", "monkey", " "};
        Arrays.sort(animals, /*정렬 로직*/ (o1,  o2) -> o1.length() - o2.length());  //람다 활용 (함수식 바로 적용)

        for (String item : animals) {
            System.out.println(item);
        }
    }
}
