package Day5;

public class PracProb6_1revised {
    public static void main(String[] args) throws Exception {
        System.out.println("3초간 기다림!");
        long initTime = System.currentTimeMillis();
        // 3초간 기다림
        Thread.sleep(3000);
        long finalTime = System.currentTimeMillis();
        System.out.println("끝");
        System.out.println("시작시간: " + initTime + "millisec");
        System.out.println("종료시간: " + finalTime + "millisec");
        System.out.println("측정된 타임 슬립: " + (finalTime - initTime) + " millisec");
    }
}
