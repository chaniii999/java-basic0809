package etc.io.textstream;

import etc.io.byteStream.FileExam;

import java.io.BufferedReader;

public class FileReader {
    public static void main(String[] args) {
        String targetPath = FileExam.ROOT_PATH + "/member.txt";
        try (java.io.FileReader fr= new java.io.FileReader(targetPath)){
            BufferedReader br = new BufferedReader(fr);
            while (true) {
                String s  = br.readLine();
                if (s == null)
                    break;
                System.out.print(s);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
