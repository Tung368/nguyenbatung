package relational.expressions;

import java.util.Scanner;

public class nested2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("nhap vao gia tri:");
        int place = scanner.nextInt();
        if (place ==1){
            System.out.println("gold meda!");
        }else if (place ==2){
            System.out.println("silver meda!");
        }else if(place ==3){
            System.out.println("bronze meda!");
        }
    }
    
}
