package MHUtils;

import Game.Hero;
import Game.Wand;
import Game.Wizard;

public class SetValidation {
    /**
     * Hero class의 setName method의 validation 수행
     *
     * @param hero
     * @param name
     */
    public static void setNameValidate(Hero hero, String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("이름 너무 짧음");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("이름 너무 긺");
        }
    }

    /**
     * Wizard class의 setName method의 validation 수행
     *
     * @param wizard
     * @param name
     */
    public static void setNameValidate(Wizard wizard, String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이어야 함");
        }
    }

    /**
     * Wand class의 setName method의 validation 수행
     *
     * @param wand
     * @param name
     */
    public static void setNameValidate(Wand wand, String name) {
        if (name == null) {
            throw new IllegalArgumentException("지팡이의 이름은 null이 아니어야 함");
        }
    }

    /**
     * Wizard class setMp method의 validation 수행
     *
     * @param wizard
     * @param mp
     */
    public static void setMpValidate(Wizard wizard, int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MP는 0 이상이어야 함");
        }
    }

    /**
     * Wizard의 setHp method의 validation 수행
     *
     * @param wizard
     * @param hp
     */
    public static void setHpValidate(Wizard wizard, int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("MP는 0 이상이어야 함");
        }
    }

    /**
     * Hero class의 setHp method의 validation 수행
     *
     * @param hero
     * @param hp
     */
    public static void setHpValidate(Hero hero, int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("MP는 0 이상이어야 함");
        }
    }

    /**
     * Wizard class의 setWand method의 validation 수행
     *
     * @param wizard
     * @param wand
     */
    public static void setWandValidate(Wizard wizard, Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("지팡이는 null이 아니어야 함");
        }
    }

    /**
     * Wand class의 setPower method의 validation 수행
     *
     * @param wand
     * @param power
     */
    public static void setPowerValidate(Wand wand, double power) {
        if ((power > 100) || (power < 0.5)) {
            throw new IllegalArgumentException("지팡이의 마력은 0.5 이상 100.0 이하 이어야 함");
        }
    }

}
