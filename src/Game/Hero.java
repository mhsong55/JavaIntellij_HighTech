package Game;

public class Hero {
    private final static int MAX_HP = 100;
    private static int money;

    private String name;
    private int hp;
    private Sword sword;


    // 기본 생성자 (Constructor)
    public Hero() {
        this("김영웅");  // 두번째 생성자 호출
    }

    // 생성자 오버로드
    public Hero(String name) {
        hp = MAX_HP;
        this.name = name;
    }

    /**
     * getName()
     * getter method of instance field of String name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * getHp()
     * getter method of instance field of int hp
     *
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * getMaxHp()
     * getter method of class final field of int MAX_HP
     *
     * @return MAX_HP
     */
    public int getMaxHp() {
        return MAX_HP;
    }

    /**
     * getMoney()
     * getter method of class field of int money
     *
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * setName(String name)
     * setter method of instance field of String name
     *
     * @param name
     */
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("이름 너무 짧음");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("이름 너무 긺");
        }
        this.name = name;
    }

    /**
     * setHp(int hp)
     * setter method of instance field of int hp
     *
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = Math.min(MAX_HP, hp);
    }

    /**
     * setMomey(int money)
     * setter method of instance field of int hp
     *
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }

    private void die() {
        System.out.println(getName() + "는 죽었다");
        System.out.println("Game Over");
    }

    public void attack(Kinoko enemy) {
        System.out.println(this.name + "의 공격!");
        System.out.println("괴물 버섯 " + enemy.suffix);
        this.hp -= 2;
        if (this.hp <= 0) {
            this.die();
        }
    }

    public void sleep() {
        setHp(MAX_HP);
        System.out.println(getName() + "는 잠을 자고 회복했다.");
    }

    public void bye() {
        System.out.println("용자는 이별을 고했다");
    }

    public void run() {
        System.out.println(getName() + "는 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는 " + getHp() + " 입니다");
    }

    public void sit(int sec) {
        setHp(hp + sec); // 앉은 초 만큼 HP 가 증가
        System.out.println(getName() + "는 " + sec + "초 앉았다");
        System.out.println("HP가 " + sec + "포인트 회복되었다");
    }

    public void slip() {
        setHp(hp - 5);
        System.out.println(getName() + "는 넘어졌다");
        System.out.println("5의 데미지!");
        if (getHp() <= 0) {
            die();
        }
    }
}
