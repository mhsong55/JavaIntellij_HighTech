package Day5;

import MHutils.WriteToFile;
import MHutils.utilTime;

public class PracProb6_4revised2 {
    public static void countPrint(long i, long hits, long countCriterion, long initTime) {
        if (i % countCriterion == 0) {
            System.out.println("i = " + i);
            double piEstimate = 4.0 * hits / i;
            System.out.println("piEstimate = " + piEstimate);
            System.out.println("estiError = " + String.format("%E", calcEstiError(piEstimate)));
            String text = i + " " + piEstimate + " "
                    + String.format("%E", calcEstiError(piEstimate)) + " "
                    + utilTime.diffTimeSec(initTime) + "\n";
            String fileName = "test";
            WriteToFile.ToText(text, fileName, true);
        }
    }

    public static double calcEstiError(double piEstimate) {
        double piRef = 3.141592;
        return Math.abs(piRef - piEstimate);
    }

    public static void main(String[] args) {
        long initTime = System.currentTimeMillis();
        long tries = 100000000L;
        long hits = 0;
        long countCriterion = 100L;
        for (long i = 1L; i < tries + 1; i++) {
            double x = PracProb6_4.makeCoordinate();
            double y = PracProb6_4.makeCoordinate();
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                hits++;
            }
            countPrint(i, hits, countCriterion, initTime);
        }
        double piEstimate = 4.0 * hits / tries;
        System.out.println("piEstimate = " + piEstimate);
        System.out.println("estiError = " + String.format("%E", calcEstiError(piEstimate)));
    }
}
