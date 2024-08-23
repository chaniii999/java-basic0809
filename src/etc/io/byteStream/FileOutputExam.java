package etc.io.byteStream;

import java.io.FileOutputStream;

public class FileOutputExam {
    // try with resource : close가 필요한 하드웨어 접근 코드에 대해
    // 메모리 정리를 자동화해주는 문법
    // close 객체가 AutoCloseable 인터페이스의 구현되어있어야함.

    public static void main(String[] args) {

        String message = "hello, Today is 8/21, wednsday~!";
        try (FileOutputStream fos
                     = new FileOutputStream(FileExam.ROOT_PATH + "/hello.txt")) {
//            fos = new FileOutputStream(FileExam.ROOT_PATH + "/upload/hello.txt");
            fos.write(message.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
