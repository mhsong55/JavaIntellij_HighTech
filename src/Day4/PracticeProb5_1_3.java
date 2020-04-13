package Day4;

public class PracticeProb5_1_3 {
    public static void introduceOneself(){
        String name = "송명훈";
        int age = 25;
        double height = 180;
        char gender = '남';
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("성별: " + gender);
    }
    public static void email(String title, String address, String text) {
        System.out.println(address + " 에 아래의 메일을 송신한다.");
        System.out.println("제목: " + title);
        System.out.println("본문: " + text);
    }
    public static void email(String address, String text) {
        System.out.println(address + " 에 아래의 메일을 송신한다.");
        System.out.println("제목: 제목 없음");
        System.out.println("본문: " + text);
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
