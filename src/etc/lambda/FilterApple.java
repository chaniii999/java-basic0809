package etc.lambda;

// 사과 필터링 기능

import java.util.ArrayList;
import java.util.List;

public class FilterApple {

    public static List<Apple> filter(List<Apple> basket, ApplePredicate predicate) {
        // 녹색 사과만 담을 바구나 생성
        List<Apple> apples = new ArrayList<>();

        for (Apple apple : basket) {
            if (predicate.test(apple)) // enum 은 ==으로 비교해도 됨.
                apples.add(apple);
        }
        return  apples;
    }

}
