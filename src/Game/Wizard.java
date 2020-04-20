package Game;

public class Wizard {
    // 모든 필드에 대해 정석에 따라 getter 메소드와 setter 메소드를 작성
    private final static int MAX_HP = 50;
    private final static int MAX_MP = 10;

    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    // Constructor
    public Wizard(String name, int hp, int mp) {
        this.name = name;
        this.hp = Math.min(MAX_HP, hp);
        this.mp = Math.min(MAX_MP, mp);
    }

    // Constructor Overload 1
    public Wizard(String name, int hp) {
        this(name, hp, MAX_MP);
    }

    // Constructor Overload 2
    public Wizard(String name) {
        this(name, MAX_HP, MAX_MP);
    }

    /**
     * getHp()
     * getter method of instance field of int HP
     *
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * getMp()
     * getter method of instance field of int MP
     *
     * @return mp
     */
    public int getMp() {
        return mp;
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
     * getWand()
     * getter method of instance field of Wand wand
     *
     * @return wand
     */
    public Wand getWand() {
        return wand;
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
     * getMaxMp()
     * getter method of class final field of int MAX_MP
     *
     * @return MAX_MP
     */
    public int getMaxMp() {
        return MAX_MP;
    }
    // setter 메소드에 대해서 인수의 타당성 검사는 하지 않아도 됨

    /**
     * setHp()
     * setter method of instance field of int hp
     *
     * @param hp
     */
    public void setHp(int hp) {
        if (hp <= 0) {
            throw new IllegalArgumentException("HP는 0 이상이어야 함");
        }
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = Math.min(MAX_HP, hp);
        }
    }

    /**
     * setMp()
     * setter method of instance field of int mp
     *
     * @param mp
     */
    public void setMp(int mp) {
        if (mp <= 0) {
            throw new IllegalArgumentException("MP는 0 이상이어야 함");
        }
        if (mp < 0) {
            this.mp = 0;
        } else {
            this.mp = Math.min(MAX_MP, mp);
        }
    }

    /**
     * setName()
     * setter method of instance field of String name
     *
     * @param name
     */
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이어야 함");
        }
        this.name = name;
    }

    /**
     * setWand()
     * setter method of instance field of Wand wand
     *
     * @param wand
     */
    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("지팡이는 null이 아니어야 함");
        }
        this.wand = wand;
    }

    // heal 메소드에서 발생하는 컴파일 에러 해결

    /**
     * heal(Hero hero)
     * hero instance의 HP를 회복시킨다.
     * Hero instance의 HP 10 포인트 기본 회복, Wizard instance의 MP 3 소모
     *
     * @param hero
     */
    public void heal(Hero hero) {
        int basePoint = 10;     // 기본 회복 포인트
        int recovPoint = (int) (basePoint * this.wand.getPower());  // 지팡이에 의한 증폭
        int decMp = 3;                                              // MP 소모량
        if (hero.getHp() == hero.getMaxHp()) {
            System.out.println(hero.getName() + "의 HP를 더 회복할 수 없다!");
            System.out.println("===================");
        } else if (getMp() < 3) {
            System.out.println(getName() + "의 MP가 부족하다!");
            System.out.println("===================");
        } else if (getMp() >= 3) {
            int beforeHp = hero.getHp();
            hero.setHp(Math.min(hero.getMaxHp(), hero.getHp() + recovPoint));   // 용사의 HP를 회복
            System.out.println(hero.getName() + "의 HP가 " + (hero.getHp() - beforeHp) + "회복!");
            System.out.println("===================");
            setMp(getMp() - decMp);
        }
    }
}

