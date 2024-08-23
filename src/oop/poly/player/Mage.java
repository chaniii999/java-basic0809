package oop.poly.player;

public class Mage extends Player {
    int mana;

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    public void blizzard(Player... targets) {
        System.out.println(this.nickName + "가 블리자드를 시전합니다!");
        this.mana -= 30;
        System.out.println("30의 마나가 소모됩니다. 현재 마나 :" + this.mana);
        for (Player p : targets) {
            int damage= (int)(Math.random() * 6) + 10;
            p.hp -= damage;
            System.out.printf("%s가 %d 데미지를 받습니다! 남은 체력 :%d\n",p.nickName,damage,p.hp);
        }
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana :" + mana);
    }
}
