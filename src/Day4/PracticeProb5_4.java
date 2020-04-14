package Day4;

public class PracticeProb5_4 {
    public static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }

    public static double calcCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        double triBottom = 4;
        double triHeight = 5;
        double circRadius = 5;
        System.out.println("밑변 = " + triBottom + " cm, 높이 = " + triHeight
                + " cm 인 삼각형의 넓이 = " + calcTriangleArea(triBottom, triHeight) + " cm²");
        System.out.println("반지름의 길이 = " + circRadius +" cm 인 원의 넓이 = "
                + calcCircleArea(circRadius) + " cm²");
    }
}
