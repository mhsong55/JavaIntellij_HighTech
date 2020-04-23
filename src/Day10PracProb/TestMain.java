package Day10PracProb;

public class TestMain {
    public static void main(String[] args) {
        String name = "name";
        int price = 0;
        String color = "Black";
        String etc = "etc";
        double weight = 1.2;

        Book book = new Book(name, price, color, etc, weight);
        Computer computer = new Computer(name, price, color, etc, weight);
        book.printScript();
        book.setWeight(0.8);
        book.printScript();
        computer.printScript();
        computer.setWeight(1.0);
        computer.printScript();
    }
}
