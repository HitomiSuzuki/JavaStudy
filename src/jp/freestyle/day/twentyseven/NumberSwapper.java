package jp.freestyle.day.twentyseven;

public class NumberSwapper {

    public static void main(String[] args) {
        double firstFloatNumber = 1.20;
        double secondFloatNumber = 2.45;

        NumberSwapper dayCounter = new NumberSwapper();

        System.out.println("-- 交換前 --");
        dayCounter.showTwoFloatNumebrs(firstFloatNumber, secondFloatNumber);

        // 数字の入れ替え
        double temp = firstFloatNumber;
        firstFloatNumber = secondFloatNumber;
        secondFloatNumber = temp;

        System.out.println("-- 交換後 --");
        dayCounter.showTwoFloatNumebrs(firstFloatNumber, secondFloatNumber);

    }

    public void showTwoFloatNumebrs(double firstFloatNumber, double secondFloatNumber) {
        System.out.printf("1個目の少数 = %.2f %n", firstFloatNumber);
        System.out.printf("2個目の少数 = %.2f %n", secondFloatNumber);
    }
}