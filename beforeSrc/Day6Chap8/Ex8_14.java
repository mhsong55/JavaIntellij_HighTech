package Day6Chap8;

import java.util.Arrays;

public class Ex8_14 {
    public static void main(String[] args) {
        // 가상 세계에 용사를 생성
        int yongsa_hp = 100;
        String yongsa_name = "명훈";

        // 생성된 용사에게 최초의 HP와 이름을 설정
        System.out.println("용사 " + yongsa_name + "를 생성했습니다!");

        // 용사에게 '5초 앉기', '넘어지기', '25초 앉기', '도망'을 지시
        yongsa_hp += 5;
        System.out.println(yongsa_name + "는 5초 앉았다");
        System.out.println("HP가 5포인트 회복되었다");
        yongsa_hp -= 5;
        System.out.println(yongsa_name + "는 넘어졌다");
        System.out.println("5의 데미지!");
        yongsa_hp += 25;
        System.out.println(yongsa_name + "는 25초 앉았다");
        System.out.println("HP가 25포인트 회복되었다");
        System.out.println(yongsa_name + "는 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는 " + yongsa_hp + " 입니다");
    }
}
