package Day4;

public class Ex5_13 {
    // int형 배열을 받아 배열 내의 요소 전부에 1을 더하는 메소드
    public static void incArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }   // 계산 결과를 리턴하지 않음

    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        incArray(array);

        for (int i : array) {
            System.out.println(i);
        }
    }
}
