package Day4;

public class Ex5_4 {
    public static void main(String[] args) {
        System.out.println("메소드를 호출합니다");
        hello("준석");
        hello("제임스 고슬링");
        hello("순다 피차이");
        System.out.println("메소드 호출을 종료합니다");
    }

    public static void hello(String name) {
        System.out.println(name + "씨 안녕하세요");
    }
}
