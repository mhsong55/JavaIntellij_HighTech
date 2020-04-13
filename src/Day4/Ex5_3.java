package Day4;

public class Ex5_3 {
    // main 메소드로부터의 메소드 호출
    public static void methodA() {
        System.out.println("methodA");
        methodB();
    }

    private static void methodB() {
        System.out.println("methodB");
    }

    public static void main(String[] args){
        methodA();
        }
}
