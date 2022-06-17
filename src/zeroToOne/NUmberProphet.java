package zeroToOne;

import java.util.Random;
import java.util.Scanner;

public class NUmberProphet {
    public static void main(String[] args) {
        final int RANGE_FOR_CORRECT = 7;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int correct = rand.nextInt(RANGE_FOR_CORRECT);

        System.out.println("予想する数を入力してください（0 ~ " + RANGE_FOR_CORRECT + ") : ");
        int prediction = scanner.nextInt();

        if (prediction == correct) {
            System.out.printf("正解です%n 正解は%dです", correct);
        } else {
            System.out.printf("正解は%dです", correct);
        }

        scanner.close();
    }

}
