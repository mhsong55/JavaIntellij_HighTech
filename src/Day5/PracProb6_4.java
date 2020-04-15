package Day5;

public class PracProb6_4 {
    public static double makeCoordinate() {
        // 4.a. 다트가 꽂히는 좌표 x, y를 랜덤한 값으로 정하되 범위는 -1 ~ 1 사이의 실수(double)로 한다
        double var = new java.util.Random().nextDouble();
        int sign = 1;
        if (new java.util.Random().nextInt(2) == 0)
            sign = -1;
        return sign * var;
    }

    public static void main(String[] args) {
        // 1. 던질 횟수를 입력해주세요 를 출력한다
        System.out.println("던질 횟수를 입력해주세요");
        // 2. 키보드로부터 long값을 변수 tries에 입력 받는다
        long tries = new java.util.Scanner(System.in).nextLong();
        // 3. 정수형 hits 변수를 0으로 초기화 한다
        int hits = 0;
        // 4. 입력받은 tries의 수 만큼 for 문을 반복하며 아래 a, b를 수행한다
        for (long i = 0L; i < tries; i++) {
            // 4.a. 다트가 꽂히는 좌표 x, y를 랜덤한 값으로 정하되 범위는 -1 ~ 1 사이의 실수(double)로 한다
            double x = makeCoordinate();
            double y = makeCoordinate();
            // 4.b. 다트가 꽂힌 좌표가 원 안에 있을 경우 hits를 증가 연산자를 사용하여 1 증가 시킨다
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1)
                hits++;
        }
        // 5. 반복이 끝나면 실수형 변수 piEstimate를 선언과 동시에 PI 값을 계산하여 대입하여 초기화 한다.
        double piEstimate = 4.0 * hits / tries;
        // 6. 마지막에 PI 값의 예상값 piEstimate를 출력한다.
        System.out.println("piEstimate = " + piEstimate);
        // 7. 3.141592... 에 가까운 값이 나오는지 확인한다.
    }
}
