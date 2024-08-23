package oop.poly.player;

public class Warrior extends Player {

    int rage; // 분노량

    Warrior(String nickname) {
        super(nickname);
        this.rage = 100;
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