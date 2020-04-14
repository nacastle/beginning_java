package eKoreatech.exceptions;

public class ExceptionTest {
    public static void main(String[] args) {

        LyricReader reader = new LyricReader();

        try {
            reader.doJob();
        } catch (BizException e) {
            System.out.println(e);
        }
    }
}
