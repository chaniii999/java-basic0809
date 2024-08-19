package oop.inherit.product;

public class SmartPhone extends ElectronicProduct {

    int storageCapacity;

    public SmartPhone(String productName, double price, String manufacturer, int storageCapacity) {
        super(productName, price, manufacturer);
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("저장 용량 : %dGB", this.storageCapacity);
    }
}
