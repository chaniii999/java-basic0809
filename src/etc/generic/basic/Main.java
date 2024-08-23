package etc.generic.basic;

import etc.generic.bad.Person;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setObj(new String("김철수"));
        int leng = box.getObj().length();

        Box<Person> box1 = new Box<>();
        box1.getObj().setName("철수");
        MultiBox<String,Integer> mB = new MultiBox<String, Integer>("철수",2);
        mB.put("춘식",4);


    }
}
