package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

public class Sorting {
    public static void main(String[] args) {

        // 육류 중 칼로리가 낮은순 정령
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .sorted(Comparator.comparing(Dish::getCalories))
                .toList()
                .forEach(System.out::println);
        // 모든 메뉴 이름 내림차 정렬

        System.out.println("============================");
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("칼로리 300보다큰 요리중 낮은 순으로 앞에서 3개");
        menuList.stream()
                .filter(s -> s.getCalories() >300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)
                .toList()
                .forEach(System.out::println);


    }
}
