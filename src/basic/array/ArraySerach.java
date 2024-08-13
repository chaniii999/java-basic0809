package basic.array;

import javax.swing.table.TableRowSorter;
import java.util.Scanner;

public class ArraySerach {
    public static void main(String[] args) {

        String[] foods = new String[]{"족발", "파스타", "치킨", "삼겹살"};
        Scanner sc = new Scanner(System.in);
        System.out.println("찾고 싶은 음식을 입력하세요.");
        String input = sc.next();
        sc.close();
        int num = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(input)) {
                num = i;
                System.out.println(foods[num] + "는 " + (num+1) + "번째 음식입니다.");
                return;
            }
        }
        System.out.println("없는 음식 입니다.");
    }
}
