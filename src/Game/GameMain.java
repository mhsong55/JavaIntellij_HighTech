package Game;

public class GameMain {
    public static void main(String[] args) {
        // Hero나 Wizard가 아닌 Character를 new 해 버렸다
        Kinoko kinoko = new Kinoko('A');
        // 오버라이드 하지 않았는데 아무 동작도 안함
    }
}
//    static void printStatus(Hero hero) {
//        System.out.println(hero.getName() + "의 상태");
//        System.out.println("HP/maxHP: " + hero.getHp() + "/" + Hero.MAX_HP);
//        System.out.println("===================");
//    }
//
//    static void printStatus(PoisonKinoko poisonKinoko) {
//        System.out.println(poisonKinoko.getSuffix() + "의 상태");
//        System.out.println("남은 Poison Attack 수: " + poisonKinoko.getPoisonAttackCount());
//        System.out.println("===================");
//    }
//public static void main(String[] args) {
//    Hero hero = new Hero();
//    PoisonKinoko poisonKinoko = new PoisonKinoko('A');
//    System.out.println("게임 시작");
//    System.out.println("===================");
//    for (int i = 0; i < 6; i++) {
//        poisonKinoko.attack(hero);
//        System.out.println("===================");
//        printStatus(hero);
//        printStatus(poisonKinoko);
//    }
//}