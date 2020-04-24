package Day5.calcapp.main;

import java.util.Arrays;

public class Ex10_Calc {
    public static void main(String[] args) {
        int[] heights = {172, 149, 152, 191, 155};
        Arrays.sort(heights);
        for (int h : heights) {
            System.out.println(h);
        }
    }
}
