package Day10PracProb;

public class Computer extends TangibleAsset {
    private String makerName;

    public Computer(String name, int price, String color, String makerName, double weight) {
        super(name, price, color, weight);
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
    }
}
