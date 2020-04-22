package Game;

public interface Human extends Creature {
    void talk();

    void watch();

    void hear();
    // 추가로, 부모 인터페이스로부터 run()을 상속받고 있음
}
