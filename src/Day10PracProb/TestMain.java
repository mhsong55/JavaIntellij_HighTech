package Day10PracProb;

public class TestMain {
    static void printStatus(Book book) {
        System.out.println("====================");
        System.out.println("book name : " + book.getName());
        System.out.println("book price : " + book.getPrice());
        System.out.println("book color : " + book.getColor());
        System.out.println("book isbn : " + book.getIsbn());
        System.out.println("book weight : " + book.getWeight() + " kg");
        System.out.println("===================");
    }

    static void printStatus(Computer computer) {

        System.out.println("===================");
        System.out.println("Computer name : " + computer.getName());
        System.out.println("Computer price : " + computer.getPrice());
        System.out.println("Computer color : " + computer.getColor());
        System.out.println("Computer makerName : " + computer.getMakerName());
        System.out.println("Computer weight : " + computer.getWeight() + " kg");
        System.out.println("===================");
    }

    public static void main(String[] args) {
        String name = "name";
        int price = 0;
        String color = "Black";
        String etc = "etc";
        double weight = 1.2;

        Book book = new Book(name, price, color, etc, weight);
        Computer computer = new Computer(name, price, color, etc, weight);

        printStatus(book);
        book.setWeight(0.8);
        printStatus(book);
        printStatus(computer);
        computer.setWeight(1.0);
        printStatus(computer);
    }
}
