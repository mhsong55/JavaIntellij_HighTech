package Day3;

public class ExForEach {
    public static void main(String[] args) {
        int[] score = new int[] { 20, 30, 40, 50, 80 };
        // 일반 for 문
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i]);
            System.out.print(" ");
        }
        System.out.println();
        // for each 문
        for (int value : score) {
            System.out.print(value);
            System.out.print(" ");
        }
    }
}
