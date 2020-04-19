package Game;

public class GameMain {
    static void printStatus(Cleric cleric) {
        System.out.println("cleric " + cleric.name + "의 상태");
        System.out.println("HP/maxHP: " + cleric.hp + "/" + cleric.MAX_HP);
        System.out.println("MP/maxMP: " + cleric.mp + "/" + cleric.MAX_MP);
        System.out.println("===================");
    }

    public static void main(String[] args) {
        Cleric cleric1 = new Cleric("박지성", 40, 10);
        Cleric cleric2 = new Cleric("손흥민", 40);
        Cleric cleric3 = new Cleric("차범근");

        printStatus(cleric1);
        printStatus(cleric2);
        printStatus(cleric3);
    }
}


//        printStatus(cleric);
//        int testCycle = 10;
//        for (int i = 0; i < testCycle; i++) {
//            cleric.hp -= 10;    // selfAid test를 위해 hp 감소
//            printStatus(cleric);
//            System.out.println("SelfAid 사용");
//            cleric.selfAid();
//            printStatus(cleric);
//            System.out.println("Pray 사용");
//            int recoveryMP = cleric.pray(3);
//            System.out.println("회복된 MP양: " + recoveryMP);
//            printStatus(cleric);
//        }
//    }
