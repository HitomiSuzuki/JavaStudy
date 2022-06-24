package Ishikawa;
//13日目 for-each ループ（拡張 for 文）を使おう

public class Aggregator {
    public static void main(String[] args) throws Exception {

        int numbers[] = new int[6];
        numbers = new int[] { 3, 4, 5, -5, 0, 12 };
        double sum = 0;
        double average;

        // ループでnumbersを集計
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }

        int numberOfElements = numbers.length; // ←lengthは要素数を表示
        System.out.println("配列の要素 " + numberOfElements + " つの合計 = " + (int) sum);

        average = sum / numbers.length;
        System.out.printf("配列の要素 " + numberOfElements + " つの平均 = " + "%.2f", average);
    }
}
