package etc.io.obj;

import etc.io.byteStream.FileExam;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadSnack {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(FileExam.ROOT_PATH + "/snack.sav")){
            // 객체를 불러올 보조 스트림
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Snack> snacks =  (List<Snack>) ois.readObject();
            for (Snack snack : snacks) {
                System.out.println(snack);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
