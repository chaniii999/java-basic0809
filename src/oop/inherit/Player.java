package oop.inherit;

public class Player {
    String nickName;
    int level;
    int hp;

    Player() {
        System.out.println("Player의 기본 생성자 호출");
        this.level = 1;
        this.hp = 50;
    }

    Player(String nickName) {
        this();
        System.out.println("2번 생성자");
        this.nickName = nickName;
    }

    Player(String nickName, int hp) {
        this(nickName);
        System.out.println("3번 생성자");
        this.hp =hp;
    }

    void  attack(Player tg) {
        if (this == tg) {
            System.out.println("자신은 때릴 수 없습니다.");
            return;
        }
        tg.hit();
        System.out.println(this.nickName + "이 " + tg.nickName + "을 공격했습니다.");
        System.out.println(tg.nickName + "의 남은 체력 : " + tg.hp);
    }

    void hit() {
        this.hp -= 10;
    }

    // 현재 캐릭터 정보를 출력
    public void showStatus() {
        System.out.println("\n======= Character's Info ========");
        System.out.println("# name: " + this.nickName);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }
}
