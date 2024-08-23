package lotto;

import java.util.HashSet;

public class Lotto {
    private HashSet<Integer> lotto;
    public Lotto() {
        createLotto();
    }

    public void createLotto() {
        HashSet<Integer> lotto = new HashSet<>();
        while(lotto.size() <= 6) {
            int num = ((int)Math.random() * 45) + 1;
            lotto.add(num);
        }
        this.lotto = lotto;
    }

    public HashSet<Integer> getLotto() {
        return lotto;
    }
}
