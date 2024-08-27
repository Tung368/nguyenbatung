package Homework;

import java.util.Random;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int points = 0;
        int wrongAttempts = 0;
        final int maxWrongAttempts = 3;

        while (wrongAttempts < maxWrongAttempts) {
            int numNumbers = random.nextInt(4) + 2;
            int[] numbers = new int[numNumbers];
            int correctAnswer = 0;

            for (int i = 0; i < numNumbers; i++) {
                numbers[i] = random.nextInt(20) + 1;
                correctAnswer += numbers[i];
            }

            StringBuilder problem = new StringBuilder();
            for (int i = 0; i < numNumbers; i++) {
                problem.append(numbers[i]);
                if (i < numNumbers - 1) {
                    problem.append(" + ");
                }
            }

            System.out.print(problem.toString() + " = ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                points++;
            } else {
                wrongAttempts++;
                System.out.println("Sai! Dap an la " + correctAnswer);
            }
        }

        System.out.println("Ban da ghi duoc tong cong " + points + " diem.");
        scanner.close();
    }
}
