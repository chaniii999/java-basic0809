package etc.stream;

public class DishDetail {
    private final String name;
    public final String type;
    public DishDetail(Dish d) {
        this.name = d.getName();
        this.type = d.getType().getName();
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
