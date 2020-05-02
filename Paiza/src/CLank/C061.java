package CLank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C061 {

    public static void main(String[] args) {
        // 입력 부분
        Scanner sc = new Scanner(System.in);
        String a = sc.next();   // 98
        String b = sc.next();   // 75

        /* 연산 부분
         * 각 자리 수 별로 덧셈하므로 1,10,100 자리 숫자를 각각 쪼개주어야 한다. */
        String[] strArrayA = a.split("");   // 98 -> 9 , 8
        String[] strArrayB = b.split("");   // 75 -> 7 , 5

        /* 정수 A, B의 자리수가 다를 수가 있는 부분을 고려해야 한다.
         * Ex] A = 15, B = 203 -> A의 length = 2, B의 length = 3 */
        int aLength = strArrayA.length;
        int bLength = strArrayB.length;
        int length = Math.max(aLength,bLength); // 자리수가 큰 값의 자리수 값 확보

        String compareLength = "a>b";   // aLength > bLength
        int diffLength = Math.abs(aLength - bLength); // 자리 수의 차이를 계산
        if (aLength < bLength) {    // aLength < bLength
            compareLength = "a<b";
        }

        /* List의 경우 index = 0일 때 각 정수의 자리수가 가장 큰 숫자가 포함 된다.
         * 따라서 length가 큰 정수를 기준으로 하여 자리수가 차이나는 경우
         * 작은 값의 list의 앞 부분에 자리 수 차이만큼 0을 넣어준다.*/
        List<Integer> intListA = new ArrayList<>();
        List<Integer> intListB = new ArrayList<>();
        if (compareLength.equals("a>b")) {
            // diffLength >= 1
            for (int i = 0; i < diffLength; i++) {  // if diffLength == 1
                intListB.add(0);                    // for문은 i == 0인 경우 1바퀴 돈다
            }                                       // Length 차이만큼 앞 자리에 0을 넣는다.
        } else if (compareLength.equals("a<b")) {
            for (int i = 0; i < diffLength; i++) {
                intListA.add(0);
            }
        }
        /*문자 타입은 숫자 덧셈이 안되므로 문자열 List에 들어있는
         *각 문자형 숫자를 각각 int형으로 type casting*/
        for (String s : strArrayA) {
            intListA.add(Integer.parseInt(s));
        }
        for (String s : strArrayB) {
            intListB.add(Integer.parseInt(s));
        }

        // 올림 무시 덧셈 연산 수행

        List<Integer> resultSum = new ArrayList<>(); // 연산 결과를 저장할 List 선언
        /* length = aLength = bLength
         * Line 16 ~ 45 에서 자리 수가 같도록 설정해주었음 */
        for (int i = 0; i < length; i++) {
            resultSum.add(intListA.get(i) + intListB.get(i));     // 올림을 무시하므로 큰 자리수부터 계산해도 무방
            if ((resultSum.get(i) / 10) == 1) {                   // 덧셈 결과 올림이 존재하면
                resultSum.set(i, resultSum.get(i) % 10);          // i번째 자리에 올림을 제외한 나머지만 덮어씌운다
            }                                                     // (올림을 무시)
        }

        // 출력부분
        for (int i = 0; i < resultSum.size(); i++) {
            System.out.print(resultSum.get(i));
        }
    }
}
