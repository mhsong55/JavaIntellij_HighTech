package Day2;

public class SwitchToIf {
    public static void main(String[] args) {
        System.out.println("당신의 운세를 점쳐 드립니다");
        int fortune = new java.util.Random().nextInt(5) + 1;

        if (fortune == 2) {
            System.out.println(("좋네요"));
        } else if (fortune == 3) {
            System.out.println("보통입니다");
        } else if (fortune == 5) {
            System.out.println("음...");
        }
    }
}
