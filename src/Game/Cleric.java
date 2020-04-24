package Game;

public class Cleric {
    final static int MAX_HP = 50;
    final static int MAX_MP = 10;

    String name;
    int hp;
    int mp;

    // A) 생성자
    Cleric(String name, int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
        this.name = name;
    }

    // B) 생성자 overload
    Cleric(String name, int hp) {
        this(name, hp, MAX_MP);
    }

    // C) 생성자 overload
    Cleric(String name) {
        this(name, MAX_HP, MAX_MP);
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

    public static class Kinoko {
        private int hp;
        private char suffix;

        public Kinoko() {
        }

        public Kinoko(char suffix) {
            this.suffix = suffix;
        }

        public char getSuffix() {
            return suffix;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public void setSuffix(char suffix) {
            this.suffix = suffix;
        }

        public void attack(Hero hero) {
            System.out.println("키노코 " + this.suffix + " 의 공격");
            System.out.println("10의 데미지");
            hero.setHp(hero.getHp() - 10);
        }
    }
}
