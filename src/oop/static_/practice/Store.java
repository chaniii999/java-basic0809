package oop.static_.practice;

class Store {
    static int total;

    public static void addSale(int amount) {
        total += amount;
    }

    public int getTotal() {
        return total;
    }

}
