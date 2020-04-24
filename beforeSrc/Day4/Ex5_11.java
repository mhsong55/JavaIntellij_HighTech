package Day4;

public class Ex5_11 {
    // 첫번째 add 메소드
    public static int add(int x, int y) {
        return x + y;
    }
    // 두번째 add 메소드
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        System.out.println("10 + 20 = " + add(10, 20));
        System.out.println("10 + 20 + 30 = " + add(10, 20, 30));
    }
}
