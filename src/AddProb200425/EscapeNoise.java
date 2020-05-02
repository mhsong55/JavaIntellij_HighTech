package AddProb200425;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class EscapeNoise {
    public abstract static class Field {
        private ArrayList<Integer> fieldInfo;

        public Field() {
            fieldInfo = new ArrayList<>();
        }

        public Field(ArrayList<Integer> fieldInfo) {
            this.fieldInfo = fieldInfo;
        }

        public ArrayList<Integer> getFieldInfo() {
            return fieldInfo;
        }

        public void setFieldInfo(ArrayList<Integer> fieldInfo) {
            this.fieldInfo = fieldInfo;
        }
    }

    public static class ConstructionField extends Field {
        public ConstructionField() {
            super();
        }

        public ConstructionField(ArrayList<Integer> fieldInfo) {
            super(fieldInfo);
        }
    }

    public static class ShadeOfTree extends Field {
        public ShadeOfTree(ArrayList<Integer> fieldInfo) {
            super(fieldInfo);
        }

        /**
         * a calculation method of distance
         * Parameter : x, y coordinate of Target(ex] ConstructionField)
         * calculate the 2-dimensional distance between Person object and Target object
         * and return double distance
         *
         * @param consField ConstructionField
         * @return calculated distance
         */
        public double distance(Field consField) {
            double xDiff = Math.abs(consField.getFieldInfo().get(0) - this.getFieldInfo().get(0));
            double yDiff = Math.abs(consField.getFieldInfo().get(1) - this.getFieldInfo().get(1));
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        }

        public void isNoisy(Field consField) {
            double distance = distance(consField);
            if (distance > consField.getFieldInfo().get(2)) {
                System.out.println("silent");
            } else {
                System.out.println("noisy");
            }
        }
    }

//    // next()로 처리
//    public static void main(String[] args) {
//        ArrayList<Integer> input = new ArrayList<>();
//        String str = "";
//        ArrayList<ShadeOfTree> treeList = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        // 공사 현장 정보 입력
//        for (int i = 0; i < 3; i++) {
//            str = scanner.next();
//            input.add(Integer.parseInt(str));
//        }
//        Field consField = new ConstructionField(input);
//        // 나무 수 입력
//        int numTree = Integer.parseInt(scanner.next());
//        // 나무 좌표 입력
//        for (int i = 0; i < numTree; i++) {
//            ArrayList<Integer> treeInput = new ArrayList<>();
//            treeInput.add(Integer.parseInt(scanner.next()));
//            treeInput.add(Integer.parseInt(scanner.next()));
//            treeList.add(new ShadeOfTree(treeInput));
//        }
//
//        // noisy 판별
//        for (int i = 0; i < numTree; i++) {
//            treeList.get(i).isNoisy(consField);
//        }
//    }

//    // nextInt()로 처리
//    public static void main(String[] args) {
//        ArrayList<Integer> input = new ArrayList<>();
//        ArrayList<ShadeOfTree> treeList = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        // 공사 현장 정보 입력
//        for (int i = 0; i < 3; i++) {
//            input.add(scanner.nextInt());
//        }
//        Field consField = new ConstructionField(input);
//        // 나무 수 입력
//        int numTree = scanner.nextInt();
//        // 나무 좌표 입력
//        for (int i = 0; i < numTree; i++) {
//            ArrayList<Integer> treeInput = new ArrayList<>();
//            treeInput.add(scanner.nextInt());
//            treeInput.add(scanner.nextInt());
//            treeList.add(new ShadeOfTree(treeInput));
//        }
//
//        // noisy 판별
//        for (int i = 0; i < numTree; i++) {
//            treeList.get(i).isNoisy(consField);
//        }
//    }

    // nextLine()로 처리
    public static ArrayList<Integer> strInputToIntArrayList(String str) {
        String[] strArray = str.split(" ");
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < strArray.length; i++) {
            intList.add(parseInt(strArray[i]));
        }
        return intList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        String str = "";
        ArrayList<ShadeOfTree> treeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 공사 현장 정보 입력
        str = scanner.nextLine();
        input = strInputToIntArrayList(str);
        Field consField = new ConstructionField(input);

        // 나무 수 입력
        str = scanner.nextLine();
        int numTree = Integer.parseInt(str);

        // 나무 좌표 입력
        for (int i = 0; i < numTree; i++) {
            str = scanner.nextLine();
            input = strInputToIntArrayList(str);
            treeList.add(new ShadeOfTree(input));
        }
        // noisy 판별
        for (int i = 0; i < numTree; i++) {
            treeList.get(i).isNoisy(consField);
        }
    }
}
