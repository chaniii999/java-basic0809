package etc.generic.bad;

public class Main {
    public static void main(String[] args) {

        Box box = new Box();
        box.setObj(new String("김춘식"));

        System.out.println(((String)box.getObj()).charAt(0));

        Box p = new Box();
        p.setObj(new Person());

        System.out.println("p.getObj() = " + ((Person)p.getObj()).getName()); // 그지같다..


    }
}
