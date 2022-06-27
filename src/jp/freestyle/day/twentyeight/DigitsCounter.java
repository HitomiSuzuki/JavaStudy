package jp.freestyle.day.twentyeight;

public class DigitsCounter {
    public static void main(String[] args) {
        int targetNumber = 123456;
        int count = 0;
        // targetNumber の桁数をカウントする
        count = Integer.toString(targetNumber).length();
        System.out.format("targetNumber の桁数 = %d %n", count);
    }
}
