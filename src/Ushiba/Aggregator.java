package Ushiba;

public class Aggregator {
    public static void main(String[] arges) {
        int[] numbers = { 3, 4, 5, -5, 0, 12 };
        int sum = 0;
        for (int b : numbers) {
            sum += b;
        }
        int numberOfElements;
        numberOfElements = numbers.length;
        System.out.println("配列の要素" + numberOfElements + "つの合計=" + sum);
        double average = ((sum / numberOfElements) * 100) / 100;
        System.out.println("配列の要素" + numberOfElements + "つの平均=" + average);
    }
}
