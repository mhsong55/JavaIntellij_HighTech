package Day6Chap8;

import Game.Hero;
import Game.Kinoko;

public class Ex8_16 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "명훈";
        hero.hp = 100;

        Kinoko kinoko1 = new Kinoko();
        kinoko1.hp = 50;
        kinoko1.suffix = 'A';

        Kinoko kinoko2 = new Kinoko();
        kinoko1.hp = 48;
        kinoko1.suffix = 'B';

        // 모험의 시작
        hero.sit(5);
        ;
        kinoko1.run();
        kinoko2.run();
        hero.run();
    }
}
