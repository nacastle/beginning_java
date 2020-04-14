package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class BruteForce {

   // 2798번 블랙잭 문제

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
    } */


}
