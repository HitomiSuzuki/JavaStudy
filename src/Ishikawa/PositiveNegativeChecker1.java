package Ishikawa;

//8日目 if-then-else 文を使おう

import java.util.Scanner;

public class PositiveNegativeChecker1 {
    public static void main(String[] args) throws Exception {

        System.out.print("正数または負数を入力してください：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();

        if (0 < num)

            System.out.println("入力値は正数です");

        else

            System.out.println("入力値は負数です");

    }

}
