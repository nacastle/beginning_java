package baekjoon;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

/*    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();



        System.out.println(A * (B%10));
        System.out.println(A * ((B%100)/10));
        System.out.println(A * (B/100));
        System.out.println(A * B);


    }
*/
/*
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if ( A > B) {
            System.out.println(">");}

        else if ( A < B) {
            System.out.println("<");}
        else if ( A == B) {
            System.out.println("==");
                }
            }
*/

/*    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if ( score >= 90 ) {
            System.out.println("A");
        } else if ( score >= 80 ) {
            System.out.println("B");
        } else if ( score >= 70 ) {
            System.out.println("C");
        } else if ( score >= 60 ) {
            System.out.println("D");
        } else {
            System.out.println("F");


        }

    }
*/


        /*        public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);

                    int year = sc.nextInt();

                    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                        System.out.println(1);
                    }
                    else {
                        System.out.println(0);
                    }

                }

         */
/*
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a < b) {
                if (b < c) {
                    System.out.println(b);
                }
                else {
                    if (a < c) {
                        System.out.println(c);
                    }
                    else {
                        System.out.println(a);
                    }
                }
            }
            else {  // a > b
                if ( b > c) {
                    System.out.println(b);
                }
                else {
                    if ( a > c ) {
                        System.out.println(c);
                    }
                    else {
                        System.out.println(a);
                    }
                }
            }


i


        }

 */
 /*       public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for (int i = 1; i < 10; i++) {
                System.out.println(n + " * " + i + " = " + (n*i));
            }



    }



  */

 /*       public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            System.out.println(n);

            for ( int i = 0; i < n; i++) {

                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println(a+b);

            }




        }

*/

   /*     public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int a = 0;


            for (int i = 1; i < n+1; i++) {

                a += i;

            }
            System.out.println(a);
        }*/

/*        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {

                System.out.println(i+1);
            }

        }*/

     /*   public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println(n-i);
            }

        }*/

       /* public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println("Case " + "#" + (i + 1) + ": " + (a + b));
            }

        }
        */

   /*     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 1; i < n+1; i++) {

                for (int j = 0; j < n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {

                    System.out.print("*");
                }
                System.out.println();
            }



        }*/
/*

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] a = new int[N];
            for (int i = 1; i <= N; i++) {
                a[i-1] = sc.nextInt();
            }
            sc.close();

            for (int i = 1; i <= N; i++) {

                if (a[i-1] < X) {
                    System.out.print(a[i-1] + " ");
                }

            }

        }
    }
*/


           /* public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int x = sc.nextInt();

                int[] a = new int[n];
                for (int i = 0; i < a.length; ++i) {
                    a[i] = sc.nextInt();
                }
                sc.close();

                for (int i = 0; i < a.length; ++i) {
                    if (a[i] < x) {
                        System.out.print(a[i] + " ");
                    }
                }
            }*/
/*

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();

                }
            }
*/

/*        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] m = new int[n];

            for (int i = 1; i < n+1; i++ ) {
                m[i-1] = sc.nextInt();
            }

            for (int i = 1; i < n+1; i++) {
                if ( m[i-1] < x ) {
                    System.out.print(m[i-1] + " ");
                }
            }


        }*/

 /*       public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner scan = new Scanner(System.in);

            while(true) {
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                if(num1 == 0 && num2 == 0) break;
                System.out.println(num1 + num2);
            }
        }
*/

  /*      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);



            while (sc.hasNextInt()) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println(a+b);

            }
        }*/


/*
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 변수정리
            int n = sc.nextInt();
            int temp = n;
     //       int n2 = 0;
            int count = 0;
*/

        // 한 자릿수 숫자 두 자릿수 만들기
     /*       if ( n / 10 == 0 ) {
                n2 = n * 10;
            } else
                n2 = n;
*/
        // 더하기 사이클 시작
/*
            while (true) {
                int a = temp / 10;
                int b = temp % 10;
                int c = (a + b) % 10;

                int d = 10 * b + c;
                temp = d;
                count++;


                if (d == n) break;

            }
            System.out.println(count);

        }
*/
        //do - while 문: while 의 조건이 충족하는 한 do 문을 실행한다.
 /*       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int temp = n;
            int cnt = 0;

            do {
                temp = (temp%10*10) + (temp/10 + temp%10)%10;
                cnt++;
            }
            while (temp != n);

            System.out.println(cnt);

        }*/

/* 10818번 최소, 최대
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] intArray = new int[n];

            int max = -1000000;
            int min = 1000000;

            for (int i=0; i < n; i++) {

                intArray[i] = sc.nextInt();

            }

            for (int i = 0; i < n; i++) {
                if ( max < intArray[i]) {
                    max = intArray[i];
                } // 최대값 도출

                if ( min > intArray[i]) {
                    min = intArray[i];
                } // 최솟값 도출

            }
            System.out.println(min + " " + max);
        }
*/

/* 2562번 최댓값
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int [] intArray = new int[9];
            int max = 0;
            int cnt = 0;

            for (int i = 0; i < 9; i++) {

                intArray[i] = sc.nextInt();
            }
            for ( int i = 0; i < 9; i++){

                if ( max < intArray[i] ) {
                    max = intArray[i];
                    cnt = i;
                }
            }
            System.out.println(max);
            System.out.println(cnt+1);


        }*/

// 백준 2577번 숫자의 개수
/*
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 3개의 자연수 입력 (150, 266, 427)
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 3개 자연수 곱 (17037300)
            int result = a*b*c;

            ArrayList<Integer> number = new ArrayList<>();

            while ( result*10 / 10 != 0) {
                number.add(result%10);
                result /= 10;
            }
            System.out.println(number);
*/
/*
            // 17037300 각 자리 숫자 배열에 담기
            int[] number = new int[10]; // 배열 수 표시 안 할수도 있나? 몇개 값이 담길지 모르니깐
            for ( int i = 0; i < 10; i++) {

                number[i] = result % 10;
                result = result/10;
            }
*//*


            // 배열 내 들어있는 0~9 숫자 갯수 세기
            for (int i = 0; i < 10; i++) {
                int cnt = 0; // cnt 갯수 세기 위해서는 어디에 이 코드를 넣어야?
                for (int j = 0; j < number.size(); j++){

                    if (number.get(j) == i) {
                        cnt++;
                    }

                }
                System.out.println(cnt); // cnt 갯수 세기 위해서는 어디에 이 코드를 넣어야? 이중 for문 일때 이게 좀 헷갈려..

            }


        }
*/



/*
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // a, b, c 입력
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int result = a*b*c;

            // 숫자 개수 세기
            for (int i = 0; i < 10; i++) {
                int cnt = 0; // cnt 값 선언 및 초기화
                int r = result; // a*b*c 값 초기화
                while (r != 0) {
                    if (r % 10 == i) {
                        cnt += 1;
                    }
                    r /= 10;
                }
                System.out.println(cnt);
            }
        }
*/

/* 2577번 숫자의 개수
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = a*b*c;

            int[] arr = new int[10]; // -> [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

            while (result != 0) {

                arr[result % 10] += 1;   -> ex) arr[0] = 0+1 = 1 --> [1, 0, 0, 0, 0, 0, 0, 0, 0, 0]
                result /= 10;
            }

            for ( int i : arr) {
                System.out.println(i);
            }

        }*/


/* 3052번 나머지
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int[] A = new int[10];
                int[] X = new int[42];

                for (int i = 0; i <A.length; i++){
                    int a = sc.nextInt() % 42;
                    X[a] += 1;
                }

                int cnt = 0;
                for (int i = 0; i < 42; i++) {
                    if (X[i] != 0) {
                        cnt++;
                    }
                }
                System.out.println(cnt);

        }*/


/*   1546번 평균
           public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            double[] a = new double[n];

            for (int i=0; i<n; i++) {
                double score = sc.nextDouble();
                a[i] = score;
            }

            double max = 0;
            for (int i = 0; i <n; i++){
                if (max < a[i]) {
                    max = a[i];
                }
            }

            double[] x = new double[n];
            double sum = 0;
            for (int i = 0; i<n; i++){
                x[i] = (a[i] / max) * 100;
                sum += x[i];
            }
            System.out.println((double) sum/n);

        }*/

/* 8958번 OX퀴즈
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            String x[] = new String[n];


            for (int i = 0; i < n; i++) {
                x[i] = sc.next();
                int cnt = 0;
                int sum = 0;
                for (int j = 0; j < x[i].length(); j++) {
                    if (x[i].charAt(j) == 'O')
                        cnt += 1;
                    else
                        cnt = 0;
                    sum += cnt;
                }
                System.out.println(sum);
            }
        }*/

/*  4344번 평균은 넘겠지

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt(); // n = 케이스 개수

            for (int i = 0; i < n; i++) {

                int m = sc.nextInt(); // m = 학생 수 (성적 개수)
                int x[] = new int[m]; // x = 성적 나열
                int sum = 0;
                double avg = 0;

                // 평균구하기
                for (int j = 0; j < m; j++) {
                    x[j] = sc.nextInt();
                    sum += x[j];
                }
                avg = sum / m;

                // 평균넘는 학생 수 구하기
                int over = 0; // over: 평균 넘는 학생 수
                for (int j = 0; j < m; j++) {
                    if (x[j] > avg)
                        over += 1;
                }
                double result = (double)over / m * 100;

                System.out.println(String.format("%.3f",result) + "%");

            }
        }
*/


//        public static void main(String[] args) {
    /*    System.out.write('A'+0);
        System.out.write('A'+1);
        System.out.write('A'+2);
        System.out.write('A'+3);
        System.out.flush();
    */


    /*    char a = 'a';
        System.out.println((int)a);*/


/*  11654번 아스키코드

            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            int b = a.charAt(0);
            System.out.println(b);

        }
*/

/*      11720번 숫자의 합
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += a.charAt(i) - '0';
        }
            System.out.println(sum);

        }*/

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String A = sc.next();

            for (char c = 'a'; c <= 'z'; c++) {
                System.out.print(A.indexOf(c)+" ");
            }
        }
    }










