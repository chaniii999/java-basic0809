package etc.lambda;

@FunctionalInterface
public interface GenericFunction<X, Y> {
    // x에서 y를 추출
    Y apply(X x);
}
