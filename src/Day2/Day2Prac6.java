package Day2;

public class Day2Prac6 {
    public static void main(String[] args) {
        // 화면에 "[숫자 맞추기 게임]"을 표시한다
        System.out.println("[숫자 맞추기 게임]");
        // 0부터 9까지의 정수 중에서 랜덤하게 수를 1개 생성해서 변수 ans 에 대입한다
        int ans = new java.util.Random().nextInt(10);
        // for 문을 이용해 "5회 반복하는 루프"를 만든다. 아래의 4. ~ 7. 은 루프 안에 기술한다.
        for (int i = 0; i < 6; i++) {
            // 화면에 "0 ~ 9 사이의 숫자를 입력 하세요"를 표시한다
            System.out.println("0 ~ 9 사이의 숫자를 입력하세요");
            // 숫자를 입력해, 변수 num 에 대입한다
            int num = new java.util.Scanner(System.in).nextInt();
            // 만약 변수 num 이 변수 ans 와 같으면 "정답!"이라고 화면에 표시하고 반복을 종료
            if (num == ans) {
                System.out.println("정답!");
                break;
            } else {
                // 만약 변수 num 이 변수 ans 와 같지 않다면 "다릅니다"를 표시한다
                System.out.println("다릅니다");
            }
        }
        // 반복 블록의 바깥에, "게임을 종료합니다" 라고 화면에 표시한다.
        System.out.println("게임을 종료합니다");
    }
}
