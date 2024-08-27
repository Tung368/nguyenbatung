package lottery;

import java.util.Random;

public class lottery {

    public static void main(String[] args) {
        Random random = new Random();
        int numberOfResults = 1;
        System.out.println("cac so xo so da chon:");

        for (int i = 0; i < numberOfResults; i++) {
            int lotteryNumber = random.nextInt(100) + 1;
            System.out.println("so may man: " + lotteryNumber);
        }
    }
}
