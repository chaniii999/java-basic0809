package basic.operator;

public class LogicalOperator {
    public static void main(String[] args) {
        /*
         # 논리 연산자 (&, &&, |, ||)
         - 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
         1. &, &&: 양쪽 항의 논리값이 모두 true일 경우에만 true가 도출됩니다.
         2. |, ||: 양쪽 항의 논리값 중 한 쪽만 true여도 true를 도출합니다.
         &&, || -> 단축 평가 연산 (short circuit operation)
         - 좌항의 연산 결과가 전체 연산 결과에 영향을 미칠 경우
          우항의 연산을 진행하지 않습니다.
        */

        int x = 9;
        int y = 10;
        System.out.println(x > 10 && (y / 1 == 10));

        int rn = (int)(Math.random() * 91) + 10;
    }
}
