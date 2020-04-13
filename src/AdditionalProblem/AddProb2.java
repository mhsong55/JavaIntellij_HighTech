package AdditionalProblem;

public class AddProb2 {
    public static void main(String[] args) {
        // 입력 받을 문자열 수
        int n = new java.util.Scanner(System.in).nextInt();
        String[] stringVal = new String[n];
        // 문자열 입력
        for (int i = 0; i < n; i++) {
            stringVal[i] = new java.util.Scanner(System.in).nextLine();
        }
        // 문자열 출력
        System.out.print("Hello ");
        for (int i = 0; i < n; i++) {
            if (i == n-1) {
                System.out.print(stringVal[i] + ".");
            } else {
                System.out.print(stringVal[i] + ",");
            }
        }
    }
}
