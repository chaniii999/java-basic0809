package etc.api.utill.set;

import java.util.*;

public class HashSetExam {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // 객체저장 : add(객체)
        set.add("java");
        set.add("jvm");
        set.add("oracle");
        Collections.addAll(set,"hi","mySql","java");
        System.out.println("set = " + set);
        Iterator<String> iter = set.iterator();
        String next = iter.next();
        System.out.println("next = " + next);
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        for (String s : set) {
            System.out.println("s = " + s);
        }
        set.remove("jvm,"); // 해당 값
        // 셋 <-> 리스트 형 변환 가능
        ArrayList<String> list =  new ArrayList<>(set);
        //셋의 값을 가져온 리스트 새롭게 생성
        list.add("java");
        System.out.println("list = " + list);
        HashSet<String> se = new HashSet<>(list);
        System.out.println("se = " + se);

    }
}
