package Ishikawa;

//14日目 while ループを使おう
import java.util.Scanner;

public class PositiveNumberAdder {
    public static void main(String[] args) throws Exception {

        int i = 0;
        int n = 0;

        Scanner sc = new Scanner(System.in);

        // 正数が入力される限り繰り返す。
        while (true) {

            System.out.print("数字を入力してください：");
            i = sc.nextInt();

            if (i < 0) {

                break;
            }
            n = n + i; // 負数は合計nに入れない。
        }
        System.out.println("合計 = " + n);
        sc.close();
    }
}
