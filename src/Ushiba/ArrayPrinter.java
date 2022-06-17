package Ushiba;

public class ArrayPrinter {
    public static void main(String[] args) {
        String[] names = new String[2];
        names[0] = "山本一郎";
        names[1] = "山田次郎";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        int[] ages = { 100, 101, 102, 103, 104, 105 };
        // for (int b = 0; b < ages.length; b++) {
        // }
        for (int b = ages.length - 1; 0 <= b; b--) {
            System.out.println(ages[b] + "歳");
        }
    }
}