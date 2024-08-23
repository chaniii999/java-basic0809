package etc.stream;

public class SimpleDish {
    private final String name;
    public final int calories;

    public SimpleDish(Dish dish){
        this.name =dish.getName();
        this.calories = dish.getCalories();;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public SimpleDish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }
}
