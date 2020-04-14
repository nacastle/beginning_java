package eKoreatech.io;

import java.io.*;

public class TextFileIOTest {
    public static void main(String[] args) {
        // 1. 텍스트 파일에서 파일 읽기
        try (BufferedReader in = new BufferedReader(
                new FileReader("yesterday.txt"))) {

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fe) {
            // 예외가 발생했을때 어떻게 해라
        } catch (IOException ie) {
            // 예외가 발생했을때 어떻게 해라
        }

        // 2. 텍스트 파일로 쓰기
        try (BufferedWriter out = new BufferedWriter(
                new FileWriter("output.txt"))) {
            out.write("Hello, world\nJava is very interesting language.");
        } catch (FileNotFoundException fe) {
            // 예외가 발생했을때 어떻게 해라
        } catch (IOException ie){
            // 예외가 발생했을때 어떻게 해라
        }
    }
}
