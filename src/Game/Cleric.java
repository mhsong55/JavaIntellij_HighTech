package Game;

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    final int MAX_HP = 50;
    final int MAX_MP = 10;

    /**
     * Self Aid
     * recovery for Cleric-self
     */
    void selfAid() {
        if (hp == MAX_HP) {
        } else if (mp >= 5) {
            mp -= 5;
            hp = MAX_HP;
        } else {
            System.out.println("SelfAid failed: MP 부족");
        }
    }

    /**
     * Skill: Pray to recovery MP of Cleric-self
     *
     * @param praySec : Time (sec) spent in pray
     * @return : MP increment
     */
    int pray(int praySec) {
        int incMp = praySec + new java.util.Random().nextInt(3);
        int beforeMp = mp;
        if (mp == MAX_MP || praySec <= 0) {
            incMp = 0;
        }
        mp = Math.min(MAX_MP, mp + incMp);
        return mp - beforeMp;   // 리턴 값은 "실제로 회복된 MP 양"
    }
}
