package Ishikawa;
//19日目 インスタンスメソッドを使おう

public class InstanceMethodHolder {
    public static void main(String[] args) {

        InstanceMethodHolder app = new InstanceMethodHolder();
        int[] targetNumbers = { -11, 0, 61 };

        for (int targetNumber : targetNumbers) {

            app.getNegativePositive(targetNumber);
        }
    }

    public void getNegativePositive(int targetNumber) {

        if (0 > targetNumber) {
            System.out.println(targetNumber + " は 負数 です");
        }
        if (0 == targetNumber) {
            System.out.println(targetNumber + " は ゼロ です");
        }
        if (0 < targetNumber) {
            System.out.println(targetNumber + " は 正数 です");
        }

    }

}

// ＊問題文です
// 変数 app に自身のクラスのインスタンスを代入する
// 配列 targetNumbers に次の 3 つの数値を代入する
// -11, 0, 61
// for-each 文で targetNumbers を処理する
// ループ中で getNegativePositive メソッドに targetNumbers の要素を渡し結果を表示する