package baekjoon;

import java.util.Scanner;

public class Math1 {

/*  1712번 손익분기점

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int x = 0;

        if (C - B <= 0) {
            x = -1;
        } else {
            x = A/(C-B) + 1;
        }
        System.out.println(x);
    }
*/

/*  2839번 설탕 배달
    실패한 풀이: n을 만들 수 있는 3의 배수의 개수와 5의 배수 개수의 합 중에서 가장 작은 합 값을 출력하려했는데 실패
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int result = 1000;

        for (int i = 0; true; i++) {
            for (int j = 0; true; j++) {
                if (5 * i + 3 * j == n) {
                    sum = i + j;
                    if (sum < result) {
                        result = sum;
                    }
                } break;
            } continue;
        }
//        System.out.println(result);
    }*/

/*  2839번 설탕 배달
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int five = 0;
        int three = 0;
        int result = 0;

        while(true) {
            if (n % 5 == 0 && n >= 0) {
                five = n / 5;
                result = three + five;
                break;
            }
            else if (n < 0) {
                result = -1;
                break;
            }
            else {
                n -= 3;
                three += 1;
            }
        }
        System.out.println(result);

    }
*/
/*  2292번 벌집
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;

        for (int i = 1; true; i++) {
            if (n == 1) {
                result = 1;
                break;
            } else if (n >= 3 * i * i - 3 * i + 2 && n <= 3 * i * i + 3 * i + 1) {
                result = i + 1;
                break;
            }
        }
        System.out.println(result);

    }
 */   /* else if (n >= 8 && n <= 19) {
                result = 3;
            } else if (n >= 20 && n <= 37) {
                result = 4;
            } else if (n >= 38 && n <= 61) {
                result = 5;
            } else if (n >= 62 && n <= 70) {
                result = 6;
            } else if (n == 1) {
                result = 1;
            }
        }*/

/*  1193번 분수찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int n = 0;
        for (int i = 0; true; i++) {

            if ( x > (i-1)*i/2 && x <= i*(i+1)/2 ) {
                n = i;
                break;
            }
        }
        int i = x - n*(n-1)/2;

        if (n%2 == 0) {
            System.out.println(i + "/" + ((n+1)-i));
        }
        else {
            System.out.println(((n + 1) - i) + "/" + i);
        }
    }*/

/*  2869번 달팽이는 올라가고 싶다 (시간이 오래걸려서 틀린 케이스)
static int a, b, v;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        v = sc.nextInt();

        int day = 0;
        int tempA = 0;

        while (tempA < v){
            day += 1;
            tempA += a;

            if (tempA >= v) break;
            tempA -= b;
        }

        System.out.println(day);
        }
*/

/*  2869번 달팽이는 올라가고 싶다 (시간이 오래걸려서 틀린 케이스)
      for (int i = 0; true; i++) {
            day += 1;
            tempA += a;
            if ( tempA >= v ) {
                break;
            }
            else {
                tempA -= b;
            }
        }
        System.out.println(day);

    }*/


/*  10250 ACM호텔
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int a = 0; a < t; a++ ) {

            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int[][] room = new int[h][w];
            int result = 0;

            for (int i = 0; i < h; i++) {       //각 방에 호수 부여하기
                for (int j = 0; j < w; j++) {

                    room[i][j] = (i + 1) * 100 + j + 1;
                }
            }


            for (int i = 0; true; i++) {

                if (n <= h) {
                    result = room[n - 1][i];
                    break;
                } else {
                    n -= h;
                }


            }

            System.out.println(result);
        }
    }
*/

/*  2775번 부녀회장이 될테야
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] room = new int[15][14];  // 0층 1호부터 14층 14호까지 생성할 배열 선언

        for (int i = 0; i < 14; i++) {  // 0층의 1호부터 14호까지는 1~14 명 부여
            room[0][i] = i + 1;
        }

        for (int i = 1; i < 15; i++) {  // i(i>=1)층 j호에 거주할 구성원 수 계산
            for (int j = 0; j < 14; j++) {
                for (int k = 0; k <= j; k++) {
                    room[i][j] += room[i - 1][j - k]; // *** 222~223 라인까지의 이 코드 논리 잘 기억해두기
                }
            }
        }

        int t = sc.nextInt(); // 시도할 케이스 수
        for (int i = 0; i < t; i++) {

            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(room[k][n - 1]);
        }
    }
*/
/*  1011번 Fly me to the Alpha Centauri  (나중에 풀기)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {





        }


    }*/

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
    }
}
