package eKoreatech.exceptions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LyricReader2 {
    public void doJob()  {
        Path path = Paths.get("yesterday.txt"); //yesterday 라는 메모장을 file 객체로 만듦


        try (Scanner in = new Scanner(path, "UTF-8")) {  // 처음부터 리소스 담아버리기 --> finally 구문이 필요 없어짐, 의미: 예외가 발생하든 안하든 닫아주겠다(close())
            in.useDelimiter("\n");
            while (in.hasNext()) {
                System.out.println(in.next());  //라인별로 화면에 출력
            }
        } catch (IOException ie) {
            System.out.println("error occurred");
        }
    }
}
