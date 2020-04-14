package eKoreatech.exceptions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//try-with-resource 구문을 이용하여 자원처리를 더 간단하고 효율적으로 할 수 있다.
public class LyricReader3 {
    public void doJob()  {
        Path path = Paths.get("yesterday.txt"); //yesterday 라는 메모장을 file 객체로 만듦


        try (Scanner in = new Scanner(path, "UTF-8")) {  // 처음부터 리소스 담아버리기 --> finally 구문이 필요 없어짐, 의미: 예외가 발생하든 안하든 닫아주겠다(close())
            in.useDelimiter("\n");
            while (in.hasNext()) {
                System.out.println(in.next());  //라인별로 화면에 출력
            }
        } catch (IOException ie) {
            throw new BizException("파일이 없습니다.", ie);
        }
    }
}
