package Ushiba;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        final int FIRST_TARGET_NUM = 15;
        final int SECOND_TARGET_NUM = 3;
        System.out.println(
                "算対象の数字は 15 と 3 です 次の 3 つのどれかの演算子を入力してください（+, -, *）: + ");
        Scanner sca = new Scanner(System.in);
        String operator = sca.nextLine();
        sca.close();
        switch (operator) {
            case "+":
                System.out.println(
                        FIRST_TARGET_NUM + "+" + SECOND_TARGET_NUM + "=" + (FIRST_TARGET_NUM + SECOND_TARGET_NUM));
                break;
            case "-":
                System.out.println(
                        FIRST_TARGET_NUM + "-" + SECOND_TARGET_NUM + "=" + (FIRST_TARGET_NUM + -SECOND_TARGET_NUM));
                break;
            case "*":
                System.out.println(
                        FIRST_TARGET_NUM + "*" + SECOND_TARGET_NUM + "=" + (FIRST_TARGET_NUM * SECOND_TARGET_NUM));
                break;
            default:
                System.out.println(FIRST_TARGET_NUM + "？" + SECOND_TARGET_NUM + "= 0");
        }
    }
}