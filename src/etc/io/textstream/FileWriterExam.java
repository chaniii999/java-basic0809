package etc.io.textstream;

import etc.io.byteStream.FileExam;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExam {
    // 텍스트 기반 스트림 : 텍스트 입출력에 특화
    // 2바이트 이상 데이터 처리 (한글이 깨지지않음)
    public static void main(String[] args) {
        String targetPath = FileExam.ROOT_PATH + "/hobby.txt";
        Scanner sc = new Scanner(System.in);

        try (FileWriter fw = new FileWriter(targetPath)){
            System.out.println("취미 입력하세요");
            String hobby = sc.next();
            String outputMsg = String.format("내 취미는 %s입니다.", hobby);
            // 파일 생성 및 데이터 출력
            fw.write(outputMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
