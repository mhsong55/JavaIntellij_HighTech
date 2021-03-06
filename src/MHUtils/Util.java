package MHUtils;

public class Util {
    public static double diffTimeSec(long initTime) {
        long finalTime = System.currentTimeMillis();
        System.out.println("Current operation time : " + ((finalTime - initTime) / 1000L) + " sec");
        return (finalTime - initTime) / 1000.0;
    }

    public static void diffTimeSec(long initTime, int mod) {
        long finalTime = System.currentTimeMillis();
        long diffTime = (finalTime - initTime) / 1000L;
        if (mod == 0) {
            System.out.println("Current operation time : " + diffTime + " sec");
        } else if (mod == 1) {
            System.out.println("Total operation time: " + diffTime + " sec");
        }
    }

    public static String stringAdd(String str) {
        String strAddResult;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        strAddResult = sb.toString();
        return strAddResult;
    }
}
