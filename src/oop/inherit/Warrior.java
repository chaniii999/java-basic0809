package oop.inherit;

public class Warrior extends Player {

    int rage; // 분노량

    Warrior(int rage) {
        super();
        this.rage = rage;
    }

    public void dash() {
        System.out.println(nickName + "이 돌진합니다.");
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage = " + rage);
    }


}