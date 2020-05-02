package DLank;

import java.util.Scanner;

public class D071 {
    public static void main(String[] args) {
        int temp = 0;
        int humidity = 0;
        Scanner sc = new Scanner(System.in);
        temp = sc.nextInt();
        humidity = sc.nextInt();

        if(temp >= 25 || humidity <= 40) {
            if(temp >= 25 && humidity <= 40) {
              System.out.println("No");
            } else {
              System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }
    }
}
