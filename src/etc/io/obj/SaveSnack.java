package etc.io.obj;

import etc.io.byteStream.FileExam;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SaveSnack {
    public static void main(String[] args) {
        List<Snack> snacks = new ArrayList<>();
        Collections.addAll(snacks,
                new Snack("콘칩",1999,1600, Snack.Taste.GOOD),
            new Snack("팝콘",1989,12000, Snack.Taste.SOSO),
            new Snack("오징어칩",2002,2000, Snack.Taste.BAD));

        try (FileOutputStream fos = new FileOutputStream(FileExam.ROOT_PATH + "/snack.sav")){
            // 객체를 출력할 수 있는 보조 스트림
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(snacks);
        } catch (Exception e) {
            e.printStackTrace();
        }






    }
}
