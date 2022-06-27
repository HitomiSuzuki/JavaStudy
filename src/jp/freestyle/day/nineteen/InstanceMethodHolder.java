package jp.freestyle.day.nineteen;

public class InstanceMethodHolder {
    public static void main(String[] args) {
        InstanceMethodHolder app = new InstanceMethodHolder();
        int[] targetNumbers = { -11, 0, 61 };

        for (int num : targetNumbers) {
            app.getNegativePositive(num);
        }

    }

    public void getNegativePositive(int num) {
        if (num > 0) {
            System.out.printf("%dは正数です%n", num);
        } else if (num < 0) {
            System.out.printf("%dは負数です%n", num);
        } else {
            System.out.printf("%dはゼロです%n", num);
        }
    }
}
