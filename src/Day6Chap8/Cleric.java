package Day6Chap8;

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    final int hpMax = 50;
    final int mpMax = 10;

    void selfAid() {
        this.mp -= 5;
        this.hp = hpMax;
    }

    // 성직자는 "기도하기" (pray)라는 행동을 취할 수 있고, 자신의 MP를 회복한다.
    // 인수로 기도한 시간(초)를 지정
    int pray(int praySec) {
        // 회복량 = 기도한 시간(초) + 0 ~ 2 (랜덤)
        // (3초 기도하면 회복량은 3 ~ 5포인트).
        // incMp = pray에 의해 회복하는 MP 양
        int incMp = praySec + new java.util.Random().nextInt(3);
        // 최대 MP보다 더 회복하는 것은 불가능.
        // 총 4가지 경우의 수 존재
        if (mp == mpMax || praySec <= 0) {
            incMp = 0;
        } else if (mp + incMp >= mpMax) {
            incMp = mpMax - mp;
            mp = mpMax;
        } else {
            mp += incMp;
        }
        return incMp;   // 리턴 값은 "실제로 회복된 MP 양"
    }
}
