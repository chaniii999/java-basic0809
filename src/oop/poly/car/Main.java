package oop.poly.car;

public class Main {
    public static void main(String[] args) {
        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Porsche p1 = new Porsche();
        Porsche p2 = new Porsche();
        Porsche p3 = new Porsche();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();
        Tesla[] te = {t1,t2,t3,t4};
        Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
        Car[][] ke = {te,cars};
        for (Car car : cars) {
            car.run();
        }
        Driver kim = new Driver();
        kim.drive(s1);

    }
}
