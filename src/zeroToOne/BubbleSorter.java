package zeroToOne;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] numbers = { 55, 71, 1, 71560, 77, 65, 91, 2, 777, };
        // 小さい値から大きい値の順番に並ぶように
        // numbers の要素を並び替える
        // iはどこまで探索するかのインデックス。未整列部分の右端と考えてもよい。
        for (int i = numbers.length - 1; i > 0; i--) {
            // jは探索対象のインデックス。一番左端から右端のiに到達するまで繰り返す。
            for (int j = 0; j < i; j++) {
                // バブルソートの比較部分
                if (numbers[j] > numbers[j + 1]) {
                    // スワップ用に一時的に保存しておく用の変数
                    int tmp = numbers[j];
                    // 以下でスワップを実行
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        showAllNumbers(numbers);
    }

    private static void showAllNumbers(int[] numbers) {
        String result = "{ ";
        for (int num : numbers) {
            result += String.format("%d, ", num);
        }
        result += "}";

        System.out.println(result);
    }
}
