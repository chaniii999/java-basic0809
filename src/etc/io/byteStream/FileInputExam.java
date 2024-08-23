package etc.io.byteStream;

import java.io.FileInputStream;


// byte 단위로 아스키코드로 읽어들인 후 write 함수로 작성한 후
// flush 로 출력
public class FileInputExam {
    public static void main(String[] args) {
        try (FileInputStream fis =
                new FileInputStream(FileExam.ROOT_PATH + "/hello.txt")) {
            int data = 0;

            while ((data = fis.read()) != -1) {
                System.out.write(data);
            }
            System.out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
