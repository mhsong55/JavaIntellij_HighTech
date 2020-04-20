package Game;

public class GameMain {
    static void printStatus(Hero hero) {
        System.out.println(hero.getName() + "의 상태");
        System.out.println("HP/maxHP: " + hero.getHp() + "/" + hero.getMaxHp());
        System.out.println("===================");
    }

    static void printStatus(Wizard wizard) {
        System.out.println(wizard.getName() + "의 상태");
        System.out.println("HP/maxHP: " + wizard.getHp() + "/" + wizard.getMaxHp());
        System.out.println("MP/maxMP: " + wizard.getMp() + "/" + wizard.getMaxMp());
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
        wizard.setName("마법사");
    }
}
