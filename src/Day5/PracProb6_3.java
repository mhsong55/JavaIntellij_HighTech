package Day5;

public class PracProb6_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            for (int j = 1; j < 13; j++) {
                if (j < 12)
                    System.out.printf("%d:%02d%s", j, i, " ");
                else
                    System.out.printf("%d:%02d\n", j, i);
            }
        }
    }
}
