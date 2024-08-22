
package assignment3;
import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoten = keyboard.nextLine();
        System.out.print("nhap tuoi: ");
        int tuoi = keyboard.nextInt();
        System.out.print("nhap nam sinh: ");
        int namsinh = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("nhap gioi tinh: ");
        String gioitinh = keyboard.nextLine();
        System.out.print("nhap chuyen nganh: ");
        String chuyennganh = keyboard.nextLine();
        System.out.print("nhap GPA:");
        float GPA = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("nhap que quan: ");
        String quequan = keyboard.nextLine();
        
        
        System.out.println("ho ten:"+hoten);
        System.out.println("tuoi:"+tuoi);
        System.out.println("nam sinh:"+namsinh);
        System.out.println("gioi tinh:"+gioitinh);
        System.out.println("chuyen nganh:"+chuyennganh);
        System.out.println("GPA:"+GPA);
        System.out.println("quequan: "+quequan);
        
    }
    
}
