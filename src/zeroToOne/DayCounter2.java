package zeroToOne;

public class DayCounter2 {

    public static void main(String[] args) {
        double firstFloatNumber = 1.20;
        double secondFloatNumber = 2.45;

        DayCounter2 dayCounter = new DayCounter2();

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
        System.out.println("1個目の少数 = " + firstFloatNumber);
        System.out.println("2個目の少数 = " + secondFloatNumber);
    }
}