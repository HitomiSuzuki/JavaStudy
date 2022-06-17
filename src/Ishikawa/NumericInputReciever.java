package Ishikawa;
//5日目　入力された数字を計算して表示する

import java.util.Scanner;

public class NumericInputReciever {
    public static void main(String[] args) throws Exception {
        Double rate; // 値が2.0と小数のため今回はDouble型
        Double resultCalclated;
        Double num;

        try {
            System.out.println("数字を入力してください");
            Scanner sc = new Scanner(System.in);
            // tryは例外処理？Scannerは標準入力の取得を行う
            num = sc.nextDouble();// 入力する部分。Doubleで出力するのでnextDouble。入力した値に応じてnextIntなどに変える必要もある

            rate = 2.0;
            resultCalclated = num * rate; // resultCalclatedに計算式を代入
            System.out.println("入力した数" + num + "を" + rate + "倍すると" + resultCalclated + "です");
            // 変数と文字の出力は分けなくても+を使えば一度に出力可能
            sc.close();
            // Scannerを閉じる
        }

        catch (Exception e) {
            System.out.println("数字を入力してください");
        }

    }
}

// 明日大山さんに聞こう。完成したプログラムに蛇足でtryをつけたらわけわからなくなった