package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class BruteForce {

   // 2798번 블랙잭 문제
/*

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
    } */


// 2231번 분해합
    /*    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nArr = new int[1000001];


        // 123 => 123 + 1 + 2 + 3
        for (int i = 1; i <= 1000000; i++) {
            nArr[i] += i;
            int tempI = i; // *****tempI 만드는 스킬 기억하기... i를 가지고 놀면 nArr[i]의 i가 계속 달라질 수 있어...
            while (true) {
                nArr[i] += tempI%10;
                tempI /= 10;
                if (tempI == 0) {
                    break;
                }
            }
        }

        int n = sc.nextInt();


        int constructor = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (nArr[i] == n) {
                constructor = i;
                break;
            }
        }
        System.out.println(constructor);

*//*        ArrayList<Integer> constructorArr = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            if (nArr[i] == n) {
                constructorArr.add(i);
            }
        }

        if (constructorArr.size() != 0) {
            System.out.println(constructorArr.get(0));
        } else {
            System.out.println(0);
        }*//*
    }*/
//1436번 영화감독 숌
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n2 = sc.nextInt();
        int result = 666 + (n2-1)*1000;

        int[] endArr = new int[10001];

        endArr[1] = 666;

        for (int i = 2; i <= 10000; i++) {
            endArr[i] = endArr[1] + (i-1) * 1000;
        }

        int n = sc.nextInt();
        System.out.println(endArr[n]);
    }
}


