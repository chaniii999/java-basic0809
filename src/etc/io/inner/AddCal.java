package etc.io.inner;

public class AddCal implements Calculator{
    @Override
    public int operator(int m1, int m2) {
        return m1 + m2;
    }
}
