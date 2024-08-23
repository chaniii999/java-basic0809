package etc.stream;

import java.util.Comparator;

import static etc.stream.Menu.menuList;
import static java.util.Comparator.*;

public class Finding {
    public static void main(String[] args) {
        boolean flag = menuList.stream()
                .anyMatch(n -> n.isVegeterian());
        System.out.println("flag = " + flag);
        flag  = menuList.stream()
                .anyMatch(n -> n.getCalories() <= 100);
        System.out.println("flag = " + flag);
        // 메뉴 중 모든 요리가 천칼로리 미만인가요?

        boolean b = menuList.stream()
                .allMatch(t -> t.getCalories() < 1000);
        System.out.println("b = " + b);

        boolean p = menuList.stream()
                .noneMatch(t -> t.getCalories() > 1000);
        System.out.println("p = " + p);

        //음식중 칼로리가 제일 낮은 음식 조회
        Dish dish = menuList.stream()
                .min(comparing(Dish::getCalories))
                .get();
        System.out.println("dish = " + dish);
    }
}
