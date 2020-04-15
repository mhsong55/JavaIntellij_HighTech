package Day5;

public class PracProb6_2 {
    // 구구단을 작성하시오
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                if (j < 9)
                    System.out.printf("%d * %d = %2d%6s", j, i, i * j, " ");
                else
                    System.out.printf("%d * %d = %2d\n", j, i, i * j);
            }
        }
    }
}
