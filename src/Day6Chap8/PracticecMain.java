package Day6Chap8;

public class PracticecMain {
    static void printStatus(Cleric cleric) {
        System.out.println("cleric " + cleric.name + "의 상태");
        System.out.println("HP/maxHP: " + cleric.hp + "/" + cleric.hpMax);
        System.out.println("MP/maxMP: " + cleric.mp + "/" + cleric.mpMax + "\n");
    }

    public static void main(String[] args) {
        Cleric cleric = new Cleric();
        cleric.name = "명훈";
        printStatus(cleric);
        cleric.hp -= 25;    // selfAid test를 위해 hp 감소
        printStatus(cleric);
        cleric.selfAid();
        printStatus(cleric);
        int recoveryMP = cleric.pray(3);
        System.out.println("회복된 MP양: " + recoveryMP);
        printStatus(cleric);
    }
}
