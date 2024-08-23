package etc.stream;

import javax.swing.event.MenuListener;
import java.util.List;

import static etc.stream.Menu.menuList;

public class Filtering {
    public static void main(String[] args) {
        //베지터가 먹을수 있는 음식만 필터링

        List<Dish> dishList = menuList
                .stream().filter(Dish::isVegeterian)
                .toList();
        dishList.forEach(System.out::println);

        //MEAT이면서 600칼로리 미만}
        System.out.println("2--=---");
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT && dish.getCalories() < 600)
                .toList().forEach(System.out::println);
        System.out.println("2--=---");

        //메뉴 목록에서 요리 이름이 4글자 미만 필터링
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .toList().forEach(System.out::println);
        System.out.println("300 칼로리 초과 음식");

        // 300 칼로리 초과 음식
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .toList().forEach(System.out::println);

        System.out.println("300칼로리보다 큰 요리중에 앞에 3개.");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .toList().forEach(System.out::println);
        System.out.println("300칼로리보다 큰 요리중에 앞에 2개 제끼고 필터링.");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2)
                .toList().forEach(System.out::println);
        List<Integer> numbers = List.of(1,2,1,3,3,2,4,4,5,6);
        numbers.stream()
                .filter(i -> i%2 == 0)
                .distinct()
                .toList()
                .forEach(System.out::println);






    }


}
