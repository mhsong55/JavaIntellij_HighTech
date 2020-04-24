package StrManipulation;

public class Prac1_2Main {
    public static String fileAddress(String folderName, String fileName) {
        StringBuilder sb = new StringBuilder();
        if (folderName.endsWith("\\")) {
            sb.append(folderName).append(fileName);
        } else {
            sb.append(folderName).append("\\").append(fileName);
        }
        String fileAddr = sb.toString();
        return fileAddr;
    }
    public static void main(String[] args) {
        String folderName = "C:\\dev";
        String fileName = "abc.txt";
        String fileAddr = fileAddress(folderName, fileName);

        System.out.println(fileAddr);
        System.out.println("==============");
        folderName = "C:\\dev\\";
        fileAddr = fileAddress(folderName, fileName);

        System.out.println(fileAddr);
    }
}
