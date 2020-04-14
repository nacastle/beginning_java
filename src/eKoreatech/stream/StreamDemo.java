package eKoreatech.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Na\\IdeaProjects\\modern-java\\src\\cities.txt");

        Stream<String> stringStream = lines(path);
       // stringStream.forEach(System.out::println);  // cities.txt 출력
        Optional<Integer> integer = stringStream.map(l -> Integer.parseInt(l.split(",")[2].trim()))
                .filter(p -> p > 100000)
                .reduce((a, b) -> a + b);

        integer = Optional.empty();  //데이터 모두 공백화

 //       integer.ifPresent(System.out::println); //데이터가 있으면 출력하라
        int data = integer.orElse(0); //데이터가 있으면 원래 데이터를 출력해주고, 없으면 0을 return 해준다
        System.out.println(data);
    }
}
