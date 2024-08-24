package relational.expressions;
import java.util.Scanner;
public class baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap vao gia tri a: ");
        double a=scanner.nextDouble();
        System.out.println("Nhap vao gia tri b: ");
        double b=scanner.nextDouble();
        if (a==0){
            if (b==0){
                System.out.println("phuong trinh co vo so nghiem");
            }else {
                System.out.println("phuong trinh vo nghiem");
            }
            }else {
                    double x = -b / a;
                    System.out.println("nghiem cua phuong trinh x="+x);
                    }
    }
}
