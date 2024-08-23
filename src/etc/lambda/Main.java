package etc.lambda;

import java.util.List;

import static etc.lambda.T.*;
import static etc.lambda.FilterApple.filter;
import static etc.lambda.MappingApple.*;

public class Main {
    public static void main(String[] args) {
        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println("=================녹색 사과만 필터링=============");
        //new  인터페이스 타입() {클래스내용}
        //오버라이딩이 필요하면 즉시 선언하여 사용

        // 녹색이면서 100g이하의 사과만 필터링
        // 인터페이스를 구현하는 익명 클래스를 람다식으로 선언 (추상메서드가 하나)

        List<Apple> filteredApples = filter(appleBasket,
                apple -> apple.getColor() == GREEN && apple.getWeight() <= 100
        );
        System.out.println("filteredApples = " + filteredApples);

        List<T> colors = mappingAppleByColor(appleBasket);
        System.out.println("colors = " + colors);

        System.out.println("=================숫자를 주면 제곱 수를 매핑=============");
        List<Integer> map1 = map(numbers, n -> n * n); // n(x) ->(return) n*n(y)
        System.out.println("numbers = " + numbers);
        System.out.println("map1 = " + map1);

        List<Integer> mapApple = map(appleBasket, n -> n.getWeight());
        System.out.println("mapApple = " + mapApple);
    }
}
