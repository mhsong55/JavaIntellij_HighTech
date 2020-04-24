package Day5.calcapp.main;

import Day5.calcapp.logics.CalcLogic;

public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int total = CalcLogic.add(a, b);
        int delta = CalcLogic.minus(a, b);
        System.out.println("더하면 " + total + ", 빼면 " + delta);
    }
}
