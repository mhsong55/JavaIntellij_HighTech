package Day3;

public class Ex4_8 {
    public static void main(String[] args) {
        int[] score = {20, 30, 40, 50, 80};
        int sum = score[1] + score[2]
                + score[3] + score[4]
                + score[5];
        int avg = sum / score.length;
        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }
}
