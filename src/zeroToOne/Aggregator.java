package zeroToOne;

public class Aggregator {
    public static void main(String[] args) {
        int[] numbers = { 3, 4, 5, -5, 0, 12 };
        double sum = 0;
        int numberOfElements = numbers.length;
        double average;

        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.printf("配列の要素%dつの合計 = %.0f%n", numberOfElements, sum);

        average = sum / numberOfElements;

        System.out.printf("配列の要素%dつの平均 = %.2f", numberOfElements, average);
    }
}
