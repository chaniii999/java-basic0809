package basic.begin;

public class PrintEx {
    public static void main(String[] args) {
        // 1. 개행을 포함하지않는 print() : 커서가 그대로 머물러있음
        // 2. 개행을 자동포함하는 println()
        // 3. 개행 x, 형식 지정 표준 출력 함수 printf() souf : 단축어

        double rate = 64.126;
        System.out.printf("합격율은 %.1f%% 입니다.",rate);

        // 특수기호 표현시 %% (2개)

    }
}
