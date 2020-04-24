package Day4;

public class Ex5_12 {
    // int형 배열을 받아 모든 요소를 출력
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3 };
        printArray(intArray);
    }
}
