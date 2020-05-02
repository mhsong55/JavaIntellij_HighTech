package DLank;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String[] c = sc.next().split("\\.");
        for(String z : c) {
            System.out.println(z);
        }
    }
}
