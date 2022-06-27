package jp.freestyle.day.twentynine;

public class DoubleLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %2d, ", i, j, i * j);
            }
            System.out.printf("%n");
        }
    }
}
