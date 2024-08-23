package oop.inherit.product;

public class Tv extends ElectronicProduct {

    int screenSize;

    public Tv(String productName, double price, String manufacturer, int screenSize) {
        super(productName, price, manufacturer);
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("스크린 사이즈 : %d인치",this.screenSize);
    }
}
