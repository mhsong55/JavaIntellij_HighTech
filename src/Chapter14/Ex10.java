package Chapter14;

public class Ex10 {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.name = "켈타스";
        h1.hp = 100;

        Hero h2 = new Hero();
        h2.name = "켈타스";
        h2.hp = 100;

        if(h1.equals(h2) == true) {
            System.out.println("같은 내용입니다");
        } else {
            System.out.println("다른 내용입니다");
        }
    }
}
