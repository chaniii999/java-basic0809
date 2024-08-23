package etc.api.utill.list;

import java.util.*;

public class ListDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> kakao = new ArrayList<>();
        Collections.addAll(kakao,"무지","네오","라이언");

        while (kakao.size() != 0) {
            System.out.println("삭제할 친구 이름을 삭제하세요");
            String name = sc.next();

            if (name.equals("그만")) {
                System.out.println("종료합니다.");
                System.out.println("kakao = " + kakao);
                return;
            }
            if (kakao.indexOf(name) == -1) { // contains (t/f)
                System.out.println("없는 이름입니다..");
                continue;
            }

            kakao.remove(name);
            System.out.println("kakao = " + kakao);
        }

        sc.close();
    }
}
