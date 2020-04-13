package Day3;
// 각 라인에서 발생하는 예외의 이름을 답하시오
public class Practice4_3 {
    public static void main(String[] args) {
        int [] counts = null;
        float[] heights = { 171.3F, 175.0F };
        System.out.println(counts[1]);  // 예외 발생
        System.out.println(heights[2]); // 예외 발생
    }
}