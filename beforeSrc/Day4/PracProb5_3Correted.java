package Day4;

public class PracProb5_3Correted {
    public static void email(String title, String address, String text) {
        System.out.println(address + " 에 아래의 메일을 송신한다.");
        System.out.println("제목: " + title);
        System.out.println("본문: " + text);
    }

    public static void email(String address, String text) {
        email("제목 없음", address, text);
    }

    public static void main(String[] args) {
        String title = "프로그래밍은 즐거워";
        String addr = "HighTech@programming.java";
        String text = "Hello World!";
        email(title, addr, text);
        System.out.println();
        email(addr, text);
    }
}
