package Game;

public class SuperHero extends Hero {
    private boolean flying;

    @Override
    public void attack(Kinoko enemy) {
//        super.attack(enemy);

        if (this.flying) {
//            System.out.println(this.getName() + "의 공격!");
//            setHp(enemy.getHp() - 5);
            System.out.println("5포인트의 데미지를 주었다!");
        }
    }
}
