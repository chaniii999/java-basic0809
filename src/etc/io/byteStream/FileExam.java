package etc.io;

import java.io.File;
import java.io.IOException;

public class FileExam {
    // 파일 저장한 기본 경로
    public static final String ROOT_PATH = "D:\\home\\upload";
    public static void main(String[] args) {

        //폴더 생성 명령
        File dir = new File(ROOT_PATH + "/hello"); // 경로 + 생성할 폴더명

        // 폴더 생성 중복 검사
        if (!dir.exists()) {
            dir.mkdir();
        }
        // 파일 생성 명령
        File newFi = new File(ROOT_PATH + "/hello/food.txt");// 경로 + 생성할 파일명

        try {
            newFi.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException("파일 생성 실패..");
        }

    }
}
