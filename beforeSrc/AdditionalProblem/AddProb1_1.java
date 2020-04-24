package AdditionalProblem;

public class AddProb1_1 {
    public static void main(String[] args) {
        // 두 정수를 입력받아 비교하여 더 큰 수를 출력하는 프로그램
        String input = new java.util.Scanner(System.in).nextLine();
        String[] strNum = input.split(" ");
        int[] intNum = {
                Integer.parseInt(strNum[0]),
                Integer.parseInt(strNum[1])
        };
        // 두 수가 같은 경우는 eq를 출력
        if (intNum[0] == intNum[1]) {
            System.out.println("eq");
        } else {
            System.out.println(Math.max(intNum[0], intNum[1]));
        }
    }
}
