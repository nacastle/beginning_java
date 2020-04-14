package baekjoon;

import java.util.Scanner;

public class Main2 {

/*    // 2675번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 몇 줄(개) 할건지

        for (int i =0; i < n; i++) {
            int repeat = sc.nextInt();  // 몇번 반복할건지
            String a = sc.next();  // 어떤 문자를 반복할건지
            for (int j = 0; j < a.length(); j++) { // 문자열 a에 들어있는 전체 문자를 참조하기 위함
                for (int k =0; k < repeat; k++) {  // j번째 위치한 문자를 m번 반복
                    char b = a.charAt(j);
                    System.out.print(b);
                }
            }
        }
    }*/

/*  1157번 단어공부

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toUpperCase(); //nextLine 이 꼭 필요한가?
        int[] cnt = new int[26]; // 26개의 배열로 a to z 까지 알파벳 인덱스 생성

        for (int i = 0; i < a.length(); i++) {  // 어떤 알파벳의 반복된 횟수 구하기
            for (int j = 0; j < 26; j++) {
                if (a.charAt(i)-65 == j) {
                    cnt[j] += 1;
                }
            }
        }

        int max = 0; // 횟수의 최댓값
        int maxIndex = 0; // 최댓값의 인덱스
        char result = 0;
        for (int i = 0; i < cnt.length; i++) {  // 가장 많이 반복된 알파벳의 인덱스 구하기
            if (max < cnt[i]) {
                max = cnt[i];
                maxIndex = i;
                result = (char) (maxIndex+65); // 그 인덱스를 문자로 변환
            } else if (max == cnt[i]){ // 어떻게 이 조건식만으로 중복된 최댓값의 여부를 알 수 있지??
                result = '?'; // 최댓값의 인덱스가 여러개면 ?를 출력
            }
        }
        System.out.println(result);


    }
*/

/*  2908번 상수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] aArrays = new int[3];
        int[] bArrays = new int[3];

        for (int i = 0; i < 3; i++) {
            aArrays[i] = a % 10;
            a /= 10;
        }
        int newA = aArrays[0] * 100 + aArrays[1] * 10 + aArrays[2];

        for (int i = 0; i < 3; i++) {
            bArrays[i] = b % 10;
            b /= 10;
        }
        int newB = bArrays[0] * 100 + bArrays[1] * 10 + bArrays[2];

        if (newA < newB) {
            System.out.println(newB);
        }else
            System.out.println(newA);

    }
*/
/*  5622번 다이얼
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next(); //input 할 단어
        int[] numb = new int[8]; // 2 - 8까지 숫자 배열


        for (int i = 0; i < word.length(); i++) { // 2~8 숫자 배열에 문자에 해당되는 숫자 횟수 세기
            if (word.charAt(i) == 'A' || word.charAt(i) == 'B' || word.charAt(i) == 'C')
                numb[0] += 1;
            else if (word.charAt(i) == 'D' || word.charAt(i) == 'E' || word.charAt(i) == 'F')
                numb[1] += 1;
            else if (word.charAt(i) == 'G' || word.charAt(i) == 'H' || word.charAt(i) == 'I')
                numb[2] += 1;
            else if (word.charAt(i) == 'J' || word.charAt(i) == 'K' || word.charAt(i) == 'L')
                numb[3] += 1;
            else if (word.charAt(i) == 'M' || word.charAt(i) == 'N' || word.charAt(i) == 'O')
                numb[4] += 1;
            else if (word.charAt(i) == 'P' || word.charAt(i) == 'Q' || word.charAt(i) == 'R' || word.charAt(i) == 'S')
                numb[5] += 1;
            else if (word.charAt(i) == 'T' || word.charAt(i) == 'U' || word.charAt(i) == 'V')
                numb[6] += 1;
            else if (word.charAt(i) == 'W' || word.charAt(i) == 'X' || word.charAt(i) == 'Y' || word.charAt(i) == 'Z')
                numb[7] += 1;
        }

        int result = 0;
        for (int i = 0; i < 8; i++) {
            result += numb[i] * (i+3);
        }
        System.out.println(result);
    }*/

/*  2941번 크로아티아 알파벳 1번 풀이
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
    }*/

/*  2941번 크로아티아 알파벳 1번 풀이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String[] croAlph = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < croAlph.length; i++) {
            input = input.replace(croAlph[i], "a");
        }
            System.out.println(input.length());
    }
*/


}
