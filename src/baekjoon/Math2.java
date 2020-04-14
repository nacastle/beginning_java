package baekjoon;

import java.util.*;

public class Math2 {

    /*  1978번 소수찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sosuCnt = 0;

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();
            int yaksuCnt = 0;

            for (int j = 1; j <= num; j++ ) {

                if (num % j == 0) {
                    yaksuCnt += 1;
                }
            }
            if (yaksuCnt == 2) {

                sosuCnt += 1;
            }
        }
        System.out.println(sosuCnt);
    }*/

/*  2581번 소수
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int sosu;
        int temMin = 10000;

        for (int i = m; i <= n; i++) {

            int yaksuCnt = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    yaksuCnt += 1;
                }
            }
            if (yaksuCnt == 2) {
                sum += i;
                sosu = i;
                if (sosu < temMin) {
                    temMin = sosu;
                }
            }

        }

        if (sum != 0) {
            System.out.println(sum);
            System.out.println(temMin);
        }
        else {
            System.out.println(-1);
        }
    }*/

/*  1929번 소수 구하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] sosuArray = new int[1000001];
        sosuArray[1] = 1;

        for (int i = 2; i <= 1000000; i++) {

            for (int j = 2; i*j <= 1000000; j++) {
                sosuArray[i * j] = 1;
            }
        }

        for (int i = m; i <= n; i++) {
            if (sosuArray[i] != 1) {
                System.out.println(i);
            }
        }
    }
*/

/*   시간초과
     for (int i = m; i <= n; i++) {
            int yaksuCnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    yaksuCnt += 1;
                }
            }
            if (yaksuCnt == 2) {
                System.out.println(i);
            }
        }
    }*/

/*  시간초과
        ArrayList<Integer> sosu = new ArrayList<>();

        for (int i = m; i <= n; i++) {
            int yaksuCnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    yaksuCnt += 1;
                }
            }
            if (yaksuCnt == 2) {
                sosu.add(i);
            }
        }

        for (int i : sosu) {
            System.out.println(i);
        }
    }
*/

/*  9020번 골드바흐의 예측

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] sosuArray = new int[10001];
        sosuArray[1] = 1;

        for (int i = 2; i <= 10000; i++) {  // 값이 0인 인덱스는 소수
            for (int j = 2; i*j <= 10000; j++ ) {
                sosuArray[i*j] = 1;
            }
        }



        for (int j = 0; j < t ; j++) {
            int n = sc.nextInt();
            int a=0, b=0;

            for (int i = 0; i <= n/2; i++) {
                if (sosuArray[n/2 - i] == 0 && sosuArray[n/2 + i] == 0) {
                    a = n/2 - i;
                    b = n/2 + i;
                    break;
                }
             }
            System.out.println(a + " " + b);
        }


    }
*/

/*  1085번 직사각형에서 탈출
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        List<Integer> lengths = new ArrayList<>();

        lengths.add(w - x);
        lengths.add(x);
        lengths.add(h - y);
        lengths.add(y);

        Collections.sort(lengths);  // Collections.sort 를 이용한 방법
        System.out.println(lengths.get(0));

*//*        int min = 1000;

        for (int i = 0; i < lengths.size(); i++) {  // 최소값 구하기 방법
            if (lengths.get(i) < min) {
                min = lengths.get(i);
            }
        }
        System.out.println(min);*//*
    }*/


    /*  3009번 네 번째 점
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int[] x = {x1, x2, x3};
        int[] y = {y1, y2, y3};

        int[] numOfX = new int[3];
        int[] numOfY = new int[3];

        int resultX = 0, resultY = 0;

        for (int i = 0; i < x.length; i++) { // 필요한 x 좌표는 값이 한 번만 나온 수 (2번 나온 값은 더이상 필요 없는 x값이다)
            for (int j = 0; j < x.length; j++){
                if (x[i] == x[j]) {
                    numOfX[i] += 1;
                }
            }
            if (numOfX[i] == 1) {
                resultX = x[i];
            }
        }

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length; j++){
                if (y[i] == y[j]) {
                    numOfY[i] += 1;
                }
            }
            if (numOfY[i] == 1) {
                resultY = y[i];
            }
        }

        System.out.println(resultX);
        System.out.println(resultY);

*/

/*  코드길이가 더 짧은 구현 방법
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int x[] = new int[1001];
            int y[] = new int[1001];
            for(int i=0; i<3; i++) {
                x[sc.nextInt()]++;
                y[sc.nextInt()]++;
            }

            for(int i=1; i<1001; i++)
                if(x[i] % 2 == 1) System.out.print(i + " ");

            for(int i=1; i<1001; i++)
                if(y[i] % 2 == 1) System.out.print(i);
        }




    }
*/

/*  4153번 직각삼각형
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            List<Integer> lengths = new ArrayList<>();

            lengths.add(sc.nextInt());  // scanner 를 이렇게도 사용할 수 있는 거 참고
            lengths.add(sc.nextInt());
            lengths.add(sc.nextInt());

            if (lengths.get(0) == 0 && lengths.get(1) == 0 && lengths.get(2) == 0) {
                break;
            }
            Collections.sort(lengths);  // 변 값들 오름차순 정리 (최대 변의 길이를 특정하기 위해)
            if (lengths.get(0)*lengths.get(0) + lengths.get(1)*lengths.get(1) == lengths.get(2)*lengths.get(2)) {
                System.out.println("right");
            }
            else
                System.out.println("wrong");
        }
    }*/

/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = 3.1415926535897932384626433; // Math.PI 로 대체 가능

        double uclidOne = Math.PI * Math.pow(r, 2);  // ** Math.PI
        double taxiOne = Math.pow(r, 2) * 2;

        System.out.println(String.format("%.6f",uclidOne));
        System.out.println(String.format("%.6f",taxiOne));

    }*/

/*  1002번 터렛

// 메소드 생성을 활용한 방법
    public static int solve(int x1, int x2, int y1, int y2, int r1, int r2) { // 메소드 만들기

        double r = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (r > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 || r < Math.abs(r1 - r2)) { //
            return 0;
        } else if (r == r1 + r2 || r == Math.abs(r1 - r2)) {
            return 1;
        } else if (x1 == x2 && y1 == y2 && r1 == r2) { //
            return -1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Math2 solve = new Math2();  // solve 메소드 불러오기

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            int result = solve(x1, x2, y1, y2, r1, r2); // solve 메소드 사용하기
            System.out.println(result);
        }
    }
}
*/




/*  메소드 생성을 사용하지 않은 방법
            if (r > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 || r < Math.abs(r1-r2)) { //
                result = 0;
            }
            else if (r == r1+r2 || r == Math.abs(r1-r2)) {
                result = 1;
            }
            else if (x1==x2 && y1==y2 && r1==r2) { //
                result = -1;
            }
            else {
                result = 2;
            }

            System.out.println(result);
        }

    }

}*/

}