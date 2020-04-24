package StrManipulation;

public class Prac1_3Main {
    public static void main(String[] args) {
        String[] strList = {"UASX", "UaDA", "U3%d", "UZS", "UAQED","USA","UONG"};
        for(String str : strList) {
            System.out.println(str.matches("^U[A-Z]{3}$"));
        }
    }
}
