package Ishikawa;

//10日目 switch 文を使おう

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int FIRST_TARGET_NUM = 15;
        int SECOND_TARGET_NUM = 3;

        System.out.println("演算対象の数字は 15 と 3 です");
        System.out.print("次の 3 つのどれかの演算子を入力してください(+,-.*):");

        Scanner sc = new Scanner(System.in);
        String operator = sc.nextLine();
        sc.close();

        switch (operator) {

            case "+":
                System.out.println("15 " + operator + " 3 = " + (FIRST_TARGET_NUM + SECOND_TARGET_NUM));
                break;

            case "-":
                System.out.println("15 " + operator + " 3 = " + (FIRST_TARGET_NUM - SECOND_TARGET_NUM));
                break;

            case "*":
                System.out.println("15 " + operator + " 3 = " + (FIRST_TARGET_NUM * SECOND_TARGET_NUM));
                break;

            default:
                System.out.println("15 " + operator + " 3 = 0");
        }
    }
}
