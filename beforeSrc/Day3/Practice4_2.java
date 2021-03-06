package Day3;

public class Practice4_2 {
    public static void main(String[] args) {
        // 다음 조건에 맞는 프로그램을 작성하시오.
        // 3개의 계좌 잔액 121902, 8302, 55100 이 담겨 있는 int형 배열 moneyList 를 선언하시오
        int[] moneyList = { 121902, 8302, 55100 };
        // 그 배열의 요소를 1개씩 for 문으로 꺼내서 화면에 표시하시오
        System.out.println("일반 for 문 사용 결과");
        for (int i = 0; i < moneyList.length; i++) {
            System.out.print(moneyList[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        // 같은 배열 요소를 for-each 문으로 1개씩 꺼내서 화면에 표시하시오
        System.out.println("for - each 문 사용 결과");
        for (int value : moneyList) {
            System.out.print(value);
            System.out.print(" ");
        }
    }
}
