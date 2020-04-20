package Game;

public class Wand {
    private String name;    // 지팡이의 이름
    private double power;   // 지팡이의 마력

    // Constructor
    public Wand(String name, double power) {
        this.name = name;
        this.power = power;
    }

    /**
     * getName()
     * getter method of instance field of String name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * getPower()
     * getter method of instance field of double power
     *
     * @return power
     */
    public double getPower() {
        return power;
    }

    /**
     * setName(String name)
     * setter method of instance field of String name
     *
     * @param name
     */
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("지팡이의 이름은 null이 아니어야 함");
        }
        this.name = name;
    }

    /**
     * setPower(double power)
     * setter method of instance field of double power
     *
     * @param power
     */
    public void setPower(double power) {
        if ((power > 100) || (power < 0.5)) {
            throw new IllegalArgumentException("지팡이의 마력은 0.5 이상 100.0 이하 이어야 함");
        }
        this.power = power;
    }
}
