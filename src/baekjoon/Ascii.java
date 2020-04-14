package baekjoon;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(A.indexOf(c)+" ");
        }
    }
}










