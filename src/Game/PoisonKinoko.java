package Game;

public class PoisonKinoko extends Kinoko {
    private int poisonAttackCount = 5;

    public PoisonKinoko(char suffix) {
        super(suffix);
    }

    public int getPoisonAttackCount() {
        return poisonAttackCount;
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);
        if (poisonAttackCount > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");
            int poisonAttack = (int) (hero.getHp() / 5);
            hero.setHp(hero.getHp() - poisonAttack);
            System.out.println(poisonAttack + "포인트의 데미지");
            poisonAttackCount--;
        }
    }
}
