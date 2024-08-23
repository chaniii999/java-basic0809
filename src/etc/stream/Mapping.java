package etc.stream;

import java.util.List;
import java.util.stream.IntStream;

import static etc.stream.Menu.menuList;

public class Mapping {
    public static void main(String[] args) {
        System.out.println("요리 이름만 추출하세요 : 맵핑");
        menuList.stream()
                .map(Dish::getName)
                .toList()
                .forEach(System.out::println);
        System.out.println("=============================================");

        List<String> words = List.of(
                "safari", "chrome", "ms edge"
                , "opera", "firefox"
        );
        words.stream()
                .map(String::length)
                .toList()
                .forEach(System.out::println);
        System.out.println("=============================================");


        words.stream()
                .map(s -> s.charAt(0)).
                toList().forEach(System.out::println);
        System.out.println("=============================================");
        menuList.stream()
                .map(SimpleDish::new)
                .toList()
                .forEach(System.out::println);

        System.out.println("=============================================");
        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.
            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */

        menuList.stream()
                .filter(n -> n.getCalories() > 300)
                .map(DishDetail::new)
                .toList()
                .forEach(System.out::println);
        int intStream = menuList.stream()
                .mapToInt(Dish::getCalories).sum();
        System.out.println("intStream = " + intStream);
        double k = menuList.stream()
                .filter(n->n.getType() == Dish.Type.MEAT)
                .mapToInt(Dish::getCalories)
                .average()
                        .getAsDouble();
        System.out.println("k = " + k);
    }
}
