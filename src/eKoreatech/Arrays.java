package eKoreatech;

import org.w3c.dom.ls.LSOutput;

public class Arrays<twoDimArr> {
    public static void main(String[] args) {

        int[] intArr = new int[5];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        intArr[4] = 5;

        System.out.println(intArr[3]);

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        for (int item : intArr) {
            System.out.println(item);
        }


    }


    //   int[] intArr2 = {1, 2, 3, 4, 5, 6};
    //      for(
    //   int item :intArr2)

    //  {
    //       System.out.println(item);
    //   }

    // 2차원 배열 202, 403호는 배달하지 않는다.
    int[][] twoDimArr = {
            {101, 102, 103, 104},
            {201, 202, 203, 204},
            {301, 302, 303, 304},
            {401, 402, 403, 404}
    };

   //// 그 이후 완성 못함;;


}