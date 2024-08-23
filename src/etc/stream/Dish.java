package etc.stream;

public class Dish {
    private final String name; // 요리 이름
    private final boolean vegeterian;
    private final int calories;
    private final Type type;

    public enum Type {
        MEAT("육류"), FISH("어류"), OTHER("기타");
        private final String name;
        private Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public Dish(String name, boolean vegeterian, int calories, Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}

