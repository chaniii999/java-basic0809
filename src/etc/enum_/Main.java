package etc.enum_;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Developer kim = new Developer();
        kim.name  = "김춘식";
        kim.career = 3;
        kim.lang = Language.JAVA;

        Developer hong = new Developer();
        hong.name  = "김춘식";
        hong.career = 3;
        kim.lang = Language.JAVASCRIPT;

        Developer kang = new Developer();
        kang.name  = "김춘식";
        kang.career = 3;
        kang.lang = Language.PYTHON;

        System.out.println("kang.lang = " + kang.lang.getName());
        for (Language value : Language.values()) {
            System.out.println("value = " + value.getName());

        }
        // Langauge 클래스의 lang이 몇번째 상수인지 인덱스를 리턴
        System.out.println(kim.lang.ordinal());

        //valueOf(문자열) : 매개값과 일치하는 요소를 리턴
        System.out.println(Language.valueOf("JAVA").getName());

    }

}
