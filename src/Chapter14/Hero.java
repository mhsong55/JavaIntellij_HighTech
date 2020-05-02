package Chapter14;

public class Hero{
    String name = "";
    int hp = 100;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Hero) {
            Hero hero = (Hero) obj;
            if (this.name.equals(hero.name)) {
                return true;
            }
        }
        return false;
    }
}
