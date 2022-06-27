package jp.freestyle.day.eighteen;

public class StaticMethodHolder {
    public static void main(String[] args) {
        int a = 57;
        int b = 25;

        int result = add(a, b);

        System.out.printf("%d + %d = %d", a, b, result);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
