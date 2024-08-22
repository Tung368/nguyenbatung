package assignment5;
import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap mot gia tri: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("ban da nhap mot so nguyen: " + number);
        } else {
            System.out.println("gia tri khong phai la so nguyen.");
        }
        
        scanner.close();
    }
}
