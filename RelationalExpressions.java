package relational.expressions;

import java.util.Scanner;

public class RelationalExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What percentage did you earn? ");
        int percent = scanner.nextInt();
        if (percent >= 90){
            System.out.println(" You got an A!");
        }
        if (percent >=80){
            System.out.println("you got an B!");
        }
        if (percent >=70){
            System.out.println("you got an C!");
        }
        if (percent >=60){
            System.out.println("you got an D!");
        }
        if (percent <60){
            System.out.println("you got an F!");
        }
    }
    
}
