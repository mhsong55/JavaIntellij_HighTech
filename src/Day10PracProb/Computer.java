package Day10PracProb;

public class Computer extends TangibleAsset {
    private String makerName;

    public Computer(String name, int price, String color, String makerName, double weight) {
        super(name, price, color, weight);
        this.makerName = makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    public String getMakerName() {
        return makerName;
    }

    @Override
    public void printScript() {
        String totalClassName = Computer.class.getName();
        String[] totalClassNameSplit = totalClassName.split("\\.");
        String className = totalClassNameSplit[1];
        System.out.println("클래스 이름: " + className);
        System.out.println("===================");
        System.out.println(className + " name : " + this.getName());
        System.out.println(className + " price : " + this.getPrice());
        System.out.println(className + " color : " + this.getColor());
        System.out.println(className + " makerName : " + this.getMakerName());
        System.out.println(className + " weight : " + this.getWeight() + " kg");
        System.out.println("===================");
    }
}
