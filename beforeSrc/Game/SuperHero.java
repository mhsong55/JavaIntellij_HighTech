package Game;

public class SuperHero extends Hero {
    private boolean flying;     // 추가한 필드

    @Override
    public void attack(Kinoko enemy) {
        System.out.println(this.getName() + "의 공격!");
        
        enemy.hp -= 2;
    }
}
