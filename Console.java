package BTjava;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner console = new Scanner ( System.in);
        int sum=0;
        int number=1;
        while(number !=0){
            System.out.print("enter a numnber(0 to quit):");
            number = console.nextInt();
            sum=sum+number;
        }
        System.out.println("the total is"+ sum);
    }
}
