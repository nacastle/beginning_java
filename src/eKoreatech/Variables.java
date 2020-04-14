package eKoreatech;

public class Variables {
    public static void main(String[] args) {
        int myInt = 312_312_311;
        System.out.println(myInt);
        long myLong = 3_432_342_341_252_345_243L;
        System.out.println(myLong);

        double myDouble = 3.4545234123123123312234234524;
        float myFloat = 3.54324234F; // 굳이 float를 사용할 일은 없음 double 주로 사용
        System.out.println(myFloat);

        int result = myInt + 3;

        char myChar = 'A'; // AB 이런식으로 문자 2개 쓰면 에러... 문자 1개만 받음
        System.out.println(myChar);

        boolean myBool = true;
        boolean myBool2 = false;

        System.out.println(myBool);






    }
}
