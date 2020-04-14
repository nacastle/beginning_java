package eKoreatech;

import java.util.Scanner;

public class Variables2 {
    public static void main(String[] args) {
/*
        int a = 3;
        int b = 5;

        int addResult = 3 + 5;
        System.out.println(addResult);

        int subResult = 3 - 5;
        int mulResult = 3 * 5;
        int divResult1 = 3 / 5;  // int로 규정했기 때문에 결과값 0
        double divResult2 = 3 / 5;  // double 이어도 3과 5가 int로 규정되었기 때문에 0.0
        double divResult3 = 3.0 / 5;  // double과 int의 연산은 double로 연산이 됨
        int modResult = 5 % 3;

        System.out.println(divResult3);

        double result = Math.pow(3, 4);  // pow는 double 타입으로 나타나기 떄문에 double 타입으로 해줘야
        double result2 = Math.sqrt(4);
        System.out.println(result2);


        // 묵시적 캐스팅

        long along = 3;  // int 타입값이 long 타입으로 캐스팅
        double aDouble = 3.14F; // float 타입을 double 타입으로 캐스팅

        // 명시적 캐스팅
        int aInt = (int) 234L;  // 괄호 연산자로 long 타입을 int 타입으로 캐스팅
        float aFloat = (float) 3.14; // double 타입을 float 타입으로 캐스팅

        //문자열
        String aStr = "Hello, World!";  // 문자열은 무조건 ""로 구성
        String aStr2 = " kin";
        String anotherStr = aStr.toUpperCase();
        System.out.println(anotherStr);

        System.out.println(aStr + aStr2);








    }*/

        Scanner sc = new Scanner(System.in);

        int n2 = sc.nextInt();

        int a = n2 / 10;
        int b = n2 % 10;
        int c = (a + b) % 10;

        int d = 10 * b + c;

        System.out.println(d);
    }
}
