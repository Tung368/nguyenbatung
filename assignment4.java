package assignment4;

import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap du lieu:");
        while (scanner.hasNext()) {
            if (scanner.hasNext("[A-Za-z]+")) {
                String str = scanner.next();
                System.out.println("da nhap chuoi: " + str);
            } else {
                System.out.println("ky tu ko phai la chuoi.");
                scanner.next();
            }
        }
        
        scanner.close();
    }
}
