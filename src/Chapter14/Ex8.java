package Chapter14;

public class Ex8 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "켈타스";
        hero.hp = 100;
        // hero.toString() 대신 hero 만 넣어도 됨
        System.out.println(hero.toString());
        System.out.println(hero);
    }
}
