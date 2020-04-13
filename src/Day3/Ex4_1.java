package Day3;

public class Ex4_1 {
    public static void main(String[] args) {
        int math = 20;
        int korean = 30;
        int science = 40;
        int english = 50;
        int society = 80;

        int sum = math + korean + science + english + society;
        int avg = sum / 5;
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
