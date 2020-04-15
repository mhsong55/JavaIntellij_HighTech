package Day5;

public class PracProb6_4revised {
    public static void countPrint(long i, long tries, long hits, long countCriterion, long initTime) {
        if (i % countCriterion == 0) {
            if (i == 0) {
//                System.out.println("i = " + (i + 1));
            } else if (i == 10000) {
                System.out.println("i = " + i);
                double piEstimate = 4.0 * hits / i;
                System.out.println("piEstimate = " + piEstimate);
                System.out.println("estiError = " + calcEstiError(piEstimate));
                utilTime.diffTimeSec(initTime, 0);
            } else if (i == 100000) {
                System.out.println("i = " + i);
                double piEstimate = 4.0 * hits / i;
                System.out.println("piEstimate = " + piEstimate);
                System.out.println("estiError = " + calcEstiError(piEstimate));
                utilTime.diffTimeSec(initTime, 0);
            } else if (i == 1000000) {
                System.out.println("i = " + i);
                double piEstimate = 4.0 * hits / i;
                System.out.println("piEstimate = " + piEstimate);
                System.out.println("estiError = " + calcEstiError(piEstimate));
                utilTime.diffTimeSec(initTime, 0);
            } else if (i == 10000000) {
                System.out.println("i = " + i);
                double piEstimate = 4.0 * hits / i;
                System.out.println("piEstimate = " + piEstimate);
                System.out.println("estiError = " + calcEstiError(piEstimate));
                utilTime.diffTimeSec(initTime, 0);
            } else if (i == 100000000) {
                System.out.println("i = " + i);
                double piEstimate = 4.0 * hits / i;
                System.out.println("piEstimate = " + piEstimate);
                System.out.println("estiError = " + calcEstiError(piEstimate));
                utilTime.diffTimeSec(initTime, 0);
            }
        } else if (i == tries - 1) {
            System.out.println("i = " + (i + 1));
            utilTime.diffTimeSec(initTime, 1);
        }
    }

    public static double calcEstiError(double piEstimate) {
        double piRef = 3.141592;
        return Math.abs(piRef - piEstimate);
    }

    public static void main(String[] args) {
        long initTime = System.currentTimeMillis();
        long tries = 1000000000L;
        long hits = 0;
        long countCriterion = 100000000L;
        for (long i = 0L; i < tries; i++) {
            double x = PracProb6_4.makeCoordinate();
            double y = PracProb6_4.makeCoordinate();
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1)
                hits++;
            countPrint(i, tries, hits, countCriterion, initTime);
        }
        double piEstimate = 4.0 * hits / tries;
        System.out.println("piEstimate = " + piEstimate);
        System.out.println("estiError = " + calcEstiError(piEstimate));
    }
}
