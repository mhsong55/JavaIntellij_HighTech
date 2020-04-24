package Day3;

public class Ex4_12 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b;
        b = a;
        b[0] = 100;
        System.out.println(a[0]);
    }
}
