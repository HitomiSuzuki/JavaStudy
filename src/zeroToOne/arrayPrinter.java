package zeroToOne;

public class arrayPrinter {
    public static void main(String[] args) {
        String[] names = new String[2];
        names[0] = "山本一郎";
        names[1] = "山田次郎";
        System.out.println(names[0] + "," + names[1]);

        int[] ages = { 100, 101, 102, 103, 104, 105 };
        for (int i = ages.length - 1; i >= 0; i--) {
            System.out.println(ages[i] + "歳");
        }
    }
}
