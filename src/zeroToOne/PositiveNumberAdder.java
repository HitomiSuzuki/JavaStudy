package zeroToOne;

import java.util.Scanner;

public class PositiveNumberAdder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (num >= 0) {
            System.out.println("数字を入力してください。");
            num = scanner.nextInt();
            sum = sum + num;
        }

        scanner.close();
        System.out.printf("合計 = %d", sum);
    }
}
