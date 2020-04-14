package baekjoon;

import java.util.Scanner;

public class Practice {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int[] alph = new int[34]; // a-z 알파벳과 특수 크로아티아 알파벳의 출연 횟수를 담을 배열

        for (int i = 0; i < input.length(); i++) { // 일반 a-z 알파벳 출연 횟수 세기
            int a = (int) input.charAt(i) - 97; // 문자의 숫자화
            if (a >= 0 && a <= 25) // '='과 같은 특수 문자 케이스를 제거하기 위한 작업
                alph[a] += 1; // 출연 횟수 세기
        }
        for (int i = 0; i < input.length(); i++) { // 특수 크로아티아 알파벳의 출연 횟수 세기
            if (i-1 >= 0 && input.charAt(i-1) == 'l' && input.charAt(i) == 'j') {
                alph[26] += 1;
                alph[11] -= 1; // 특수 크로아티아 알파벳을 세면서 일반 알파벳도 중복으로 세지므로, 일반 알파벳 케이스 출연 횟수 줄이기
                alph[9] -= 1;
            } else if (i-1 >= 0 && input.charAt(i-1) == 'n' && input.charAt(i) == 'j') {
                alph[27] += 1;
                alph[13] -= 1;
                alph[9] -= 1;
            } else if (i-1 >= 0 && input.charAt(i-1) == 'c' && input.charAt(i) == '=') {
                alph[28] += 1;
                alph[2] -= 1;
            } else if (i-2 >= 0 && input.charAt(i-2) == 'd' && input.charAt(i-1) == 'z' && input.charAt(i) == '=') {
                alph[29] += 1;
                alph[3] -= 1;
                alph[25] -= 1;
            } else if (i-1 >= 0 && input.charAt(i-1) == 'c' && input.charAt(i) == '-') {
                alph[30] += 1;
                alph[2] -= 1;
            } else if (i-1 >= 0 && input.charAt(i-1) == 'd' && input.charAt(i) == '-') {
                alph[31] += 1;
                alph[3] -= 1;
            } else if (i-1 >= 0 && input.charAt(i-1) == 's' && input.charAt(i) == '=') {
                alph[32] += 1;
                alph[18] -= 1;
            } else if (i-1 >= 0 && input.charAt(i-1) == 'z' && input.charAt(i) == '=') {
                alph[33] += 1;
                alph[25] -= 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < alph.length; i++) { // 알파벳의 개수 세기
            if (alph[i] != 0) {
                sum += alph[i];
            }
        }
        System.out.println(sum);
    }
}