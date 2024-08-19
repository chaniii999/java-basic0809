package encap.car;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("테슬라 모델3");
        c.setSpeed(100);
        c.engineStart();
        c.engineStop();
    }
}
