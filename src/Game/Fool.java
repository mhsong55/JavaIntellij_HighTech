package Game;

public class Fool extends Character implements Human {
    // Character로부터 hp나 getName()등의 메소드를 상속받고 있다
    // Character로부터 상속 받은 추상 메소드 attack()
    @Override
    public void attack(Cleric.Kinoko kinoko) {
//        System.out.println(getName() + "는 싸우지 않고 놀고 있다");
    }

    // 여기부터는 Human의 공통 추상 메소드
    @Override
    public void run() {
        super.run();
    }

    @Override
    public void talk() {

    }

    @Override
    public void watch() {

    }

    @Override
    public void hear() {

    }
}
