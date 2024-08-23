package etc.io.obj;


import java.io.Serializable;

public class Snack implements Serializable {
    public enum Taste {
        GOOD, BAD, SOSO
    }
    private String name;
    private int year;
    private int price;
    private Taste taste;

    public Snack(String name, int year, int price, Taste taste) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
