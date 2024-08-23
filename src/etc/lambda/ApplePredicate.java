package etc.lambda;

@FunctionalInterface
public interface ApplePredicate {
    //사과를 전달받으면,조건 검사, 결과값 리턴
    boolean test(Apple apple);
}
