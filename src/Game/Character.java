package Game;

public abstract class Character {
    String name;
    int hp;

    public abstract void attack(Kinoko enemy);

    public void run() {
        System.out.println(name + "은 도망쳤다");
    }
}
