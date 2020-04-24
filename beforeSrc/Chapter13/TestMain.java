package Chapter13;

public class TestMain {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Y[] ys = {a, b};

        for (Y y : ys) {
            y.b();
        }
    }
}
