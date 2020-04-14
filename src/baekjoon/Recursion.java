package baekjoon;

import javax.swing.*;
import java.util.*;

public class Recursion {

/*  10872번 팩토리얼
    public static int factorial(int num) {

        if (num == 0) {  // 0! 의 결과값은 1이다 (정의)
            return 1;
        }
        else
            return num * factorial(num-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(factorial(num));
    }
*/

/*  10870번 피보나치 수 5

    public static int fibonacci (int n) {

        if (n == 0)
            return 0;
        else if (n == 1) {
            return 1;
        }
        else
            return fibonacci(n-1) + fibonacci(n-2);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }
*/

/* **실패: 2447번 별찍기 - 10
public static String dotting (int n) {

    for (int i = 0; true; i++) {

        for (int j = 0; true; j++) {

        }
    }

    if (n == 3) {
        return "***\n* *\n***";
    }
    else
        return dotting(n/3)
}

*/

/*
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] star = new String[n][n];

        star[0][0] = "*";

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                star[i][j] = star[0][0];
                if (j == n-1) {
                }
            }
        }
        System.out.println(star);
        */
/*
        System.out.println(dotting(n));
*//*
    }
*/

/*  2798번 블랙잭 문제

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 카드의 개수
        int m = sc.nextInt();  // 가까이 다가갈 숫자 m 설정
        ArrayList<Integer> card = new ArrayList<>(); // 카드 숫자 설정할 배열

        for (int i = 0; i < n; i++) { // 카드 숫자 설정
            int a = sc.nextInt();
            card.add(a);
        }

//        ArrayList<Integer> sums = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = card.get(i) + card.get(j) + card.get(k);

                    if (sum == m) {
                        max = sum;
                    } else if (sum < m) {
                        max = Math.max(sum, max);  // max 함수 참고
                    }
                }
            }
        }
        System.out.println(max);
    }
*/


    /*  sum 값들을 배열 안에 넣어서 최대값 구한 방식
        for (int i = 0; i < sum.size(); i++) {

            if (sum.get(i) == m) {
                max = sum.get(i);
            }
            else if (sum.get(i) > max) {
                max = sum.get(i);
            }
        }
        System.out.println(max);
    }*/
}
