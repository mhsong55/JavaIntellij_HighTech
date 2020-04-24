package AdditionalProblem;

public class AddProb1_2 {
    public static void main(String[] args) {
        // 두 정수를 입력받아 비교하여 더 큰 수를 출력하는 프로그램
        System.out.println("2개의 정수를 공백 한 칸으로 구분해 입력하세요");
        String input = new java.util.Scanner(System.in).nextLine();
        int[] intNum = {
                Integer.parseInt(input.split(" ")[0]),
                Integer.parseInt(input.split(" ")[1])
        };
        String result = (intNum[0] == intNum[1])
                ? "eq" : (intNum[0] > intNum[1])
                ? Integer.toString(intNum[0]) : Integer.toString(intNum[1]);
        System.out.println(result);
    }
}
