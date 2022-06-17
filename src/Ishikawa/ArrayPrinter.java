package Ishikawa;
//12日目 配列を使おう

import java.util.Arrays;

public class ArrayPrinter {
    public static void main(String[] args) throws Exception {
        String[] names = new String[2];

        names[0] = "山田一郎";
        names[1] = "山田次郎";

        System.out.println(names[0] + "," + names[1]);

        int[] ages = new int[6];
        ages = new int[] { 100, 101, 102, 103, 104, 105 };

        // 降順にするためのコード
        // -----------------------------------------------------------
        Arrays.sort(ages);

        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[ages.length - i - 1] + ",");
        }
        // -----------------------------------------------------------
    }
}
