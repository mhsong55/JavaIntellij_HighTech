package Game;

public class GameMain {
    static void printStatus(Hero hero) {
        System.out.println(hero.getName() + "의 상태");
        System.out.println("HP/maxHP: " + hero.getHp() + "/" + Hero.MAX_HP);
        System.out.println("===================");
    }

    static void printStatus(Wizard wizard) {
        System.out.println(wizard.getName() + "의 상태");
        System.out.println("HP/maxHP: " + wizard.getHp() + "/" + Wizard.MAX_HP);
        System.out.println("MP/maxMP: " + wizard.getMp() + "/" + Wizard.MAX_MP);
        System.out.println("===================");
    }

    static void printStatus(Wand wand) {
        System.out.println(wand.getName() + "의 정보");
        System.out.println("Power: " + wand.getPower());
        System.out.println("===================");
    }

    public static void main(String[] args) {
        Wizard wizard = new Wizard("위자드");
        Hero hero = new Hero("히어로");
        Wand wand = new Wand("완드", 1.2);
        wizard.setWand(wand);

        printStatus(hero);
        printStatus(wizard);
        printStatus(wand);
        int testCycle = 5;
        for (int i = 0; i < testCycle; i++) {
            if (i == 0) {
                // hero hp == Hero.MAX_HP 일 때 heal 사용 test
            } else {
                hero.setHp(hero.getHp() - 15); // test를 위해 hp 감소
                printStatus(hero);
            }
            System.out.println("heal 사용");
            wizard.heal(hero);
            printStatus(hero);
            printStatus(wizard);
        }
    }
}
