package assignment1;

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen thu nhat: ");
        int a=scanner.nextInt();
        System.out.println("nhap so nguyen thu hai: ");
        int b=scanner.nextInt();
        int tong = a+b;
        int hieu = a-b;
        int tich = a*b;
        int thuong = a/b;
        int chiadu = a%b;
        System.out.println("tong cua a+b la: "+tong);
        System.out.println("hieu cua a-b la: "+hieu);
        System.out.println("tich cua a*b la: "+tich);
        System.out.println("thuong cua a/b la: "+thuong);
        System.out.println("chia du cua a%b la: "+chiadu);
    }
}
