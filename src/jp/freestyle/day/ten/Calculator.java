package jp.freestyle.day.ten;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        final int FIRST_TARGET_NUM = 15;
        final int SECOND_TARGET_NUM = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("演算対象の数字は%dと%dです。%n次の3つのどれかの演算子を入力してください（+, -, *） : ", FIRST_TARGET_NUM, SECOND_TARGET_NUM);
        String operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.printf("%d + %d = %d", FIRST_TARGET_NUM, SECOND_TARGET_NUM,
                        FIRST_TARGET_NUM + SECOND_TARGET_NUM);
                break;

            case "-":
                System.out.printf("%d - %d = %d", FIRST_TARGET_NUM, SECOND_TARGET_NUM,
                        FIRST_TARGET_NUM - SECOND_TARGET_NUM);
                break;

            case "*":
                System.out.printf("%d * %d = %d", FIRST_TARGET_NUM, SECOND_TARGET_NUM,
                        FIRST_TARGET_NUM * SECOND_TARGET_NUM);
                break;

            default:
                System.out.printf("%d ? %d = 0", FIRST_TARGET_NUM, SECOND_TARGET_NUM);
                break;
        }

        scanner.close();

    }
}
