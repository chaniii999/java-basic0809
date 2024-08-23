package oop.encap.practice;

public class Product {
    private String name;
    private int price;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reduceStock(int stock) {
        if (stock < 0 || this.stock < stock) {
            System.out.println("잘못된 입력");
            return;
        }
        this.stock -= stock;
    }
}
