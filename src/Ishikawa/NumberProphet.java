package Ishikawa;
//7日目 if-then 文を使おう

import java.util.Scanner;
import java.util.Random;

public class NumberProphet {
    public static void main(String[] args) throws Exception {

        System.out.print("予想される数を入力してください（0～7）:");
        Scanner sc = new Scanner(System.in);
        int prediction = sc.nextInt();
        System.out.println(prediction);
        sc.close();

        final int RANGE_FOR_CORRECT = 7; // 7だと数値は6までしか出ないのでは…？
        Random rand = new Random();
        int correct = rand.nextInt(RANGE_FOR_CORRECT);
        System.out.println(correct);

        if (prediction == correct) {

            System.out.println("正解です。正解は" + correct + "です");

        }

        else {

            System.out.println("正解は" + correct + "です");

        }
    }

}
