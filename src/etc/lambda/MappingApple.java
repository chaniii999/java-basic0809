package etc.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {


    // 사과의 색상만 추출해줌

    public static List<T> mappingAppleByColor(List<Apple> apples) {
        List<T> colors = new ArrayList<>();
        for (Apple apple : apples) {
            colors.add(apple.getColor());
        }
        return colors;
    }

    public static <X,Y>List<Y> map(List<X> list,GenericFunction<X,Y> mapper) {
        List<Y> ans = new ArrayList<>();
        for (X x : list) {
            Y y = mapper.apply(x);
            ans.add(y);
        }
        return ans;
    }
}
