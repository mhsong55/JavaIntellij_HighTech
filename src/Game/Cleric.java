package Game;

public class Cleric {
    String name;
    int hp;
    int mp;
    final static int MAX_HP = 50;
    final static int MAX_MP = 10;

    // A) 생성자
    Cleric(String name, int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
        this.name = name;
    }

    // B) 생성자 overload
    Cleric(String name, int hp) {
        this.name = name;
        this.hp = hp;
        mp = MAX_MP;
    }

    // C) 생성자 overload
    Cleric(String name) {
        this.name = name;
        hp = MAX_HP;
        mp = MAX_MP;
    }

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
        // 초 + 보정량 (0 ~ 2)
        int incMP = praySec + new java.util.Random().nextInt(3);
        // 회복 전
        int beforeMp = mp;
        if (mp == MAX_MP || praySec <= 0) {
            incMP = 0;
        }
        mp = Math.min(MAX_MP, mp + incMP);
        return mp - beforeMp;   // 리턴 값은 "실제로 회복된 MP 양"
    }
}
