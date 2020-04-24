package Day10PracProb;

public class Book extends TangibleAsset {
    private String isbn;

    public Book(String name, int price, String color, String isbn, double weight) {
        super(name, price, color, weight);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void printScript() {
        String totalClassName = Book.class.getName();
        String[] totalClassNameSplit = totalClassName.split("\\.");
        String className = totalClassNameSplit[1];
        System.out.println("클래스 이름: " + className);
        System.out.println("====================");
        System.out.println(className + " name : " + this.getName());
        System.out.println(className + " price : " + this.getPrice());
        System.out.println(className + " color : " + this.getColor());
        System.out.println(className + " isbn : " + this.getIsbn());
        System.out.println(className + " weight : " + this.getWeight() + " kg");
        System.out.println("===================");
    }
}
