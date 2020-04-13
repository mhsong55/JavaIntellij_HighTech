package Day4;

public class Ex5_10 {
    // 첫번째 add 메소드
    public static int add(int x, int y) {
        return x + y;
    }
    // 두번째 add 메소드
    public static double add(double x, double y) {
        return x + y;
    }
    // 세번째 add 메소드
    public static String add(String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(3.5, 2.7));
        System.out.println(add("Hello","World"));
    }
}
