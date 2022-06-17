package Ishikawa;

//9日目 if-else-if 文を使おう

import java.util.Scanner;

public class PositiveNegativeChecker2 {
    public static void main(String[] args) throws Exception {

        System.out.print("正数または負数を入力してください：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();

        if (0 < num) {

            System.out.println("入力値は正数です");

        } else if (0 > num)

        {
            System.out.println("入力値は負数です");

        } else if (0 == num) {

            System.out.println("入力値は0です");

        }

    }

}
