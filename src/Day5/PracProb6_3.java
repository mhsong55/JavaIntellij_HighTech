package Day5;

public class PracProb6_3 {
    public static void main(String[] args) {
        for (int min = 0; min < 60; min++) {
            for (int hour = 1; hour < 13; hour++) {
                if (hour < 12) {
                    System.out.printf("%d:%02d%s", hour, min, " ");
                } else {
                    System.out.printf("%d:%02d\n", hour, min);
                }
            }
        }
    }
}
