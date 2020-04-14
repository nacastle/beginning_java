package eKoreatech.exceptions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LyricReader {
    public void doJob()  {
        Path path = Paths.get("yesterday.txt"); //yesterday 라는 메모장을 file 객체로 만듦


        Scanner in = null;
        try {
            in = new Scanner(path, "UTF-8"); // path 파일 읽기
            in.useDelimiter("\n");
            while (in.hasNext()) {
                System.out.println(in.next());  //라인별로 화면에 출력
            }
        } catch (IOException ie) {
            System.out.println("error occurred");
        } finally {  //자원을 해제하기 위한 구문
            if (in != null)
            in.close();
        }
    }
}
