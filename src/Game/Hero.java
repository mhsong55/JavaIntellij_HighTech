package Game;

public class Hero {
    String name;
    int hp;
    static int money;
    Sword sword;

    // 기본 생성자 (Constructor)
    Hero() {
        this("김영웅");  // 두번째 생성자 호출
    }

    // 생성자 오버로드
    Hero(String name) {
        hp = 100;
        this.name = name;
    }

    void attack() {
        System.out.println(this.name + "는 공격했다");
        System.out.println("적에게 5포인트의 데미지를 주었다");
    }

    public void run() {
        System.out.println(this.name + "는 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는 " + this.hp + " 입니다");
    }

    public void sit(int sec) {
        this.hp += sec; // 앉은 초 만큼 HP 가 증가
        System.out.println(this.name + "는 " + sec + "초 앉았다");
        System.out.println("HP가 " + sec + "포인트 회복되었다");
    }

    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "는 넘어졌다");
        System.out.println("5의 데미지!");
    }

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다.");
    }
}

