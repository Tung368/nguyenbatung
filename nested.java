package relational.expressions;

import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap gia tri:");
        int x = scanner.nextInt();
        if (x >0){
            System.out.println("poaitive");
        }
        else if (x<0){
            System.out.println("negative");
        }else{
            System.out.println("Hero");
        }
        
        
    }
}
