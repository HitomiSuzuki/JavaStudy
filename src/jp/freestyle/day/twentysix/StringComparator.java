package jp.freestyle.day.twentysix;

public class StringComparator {
    public static void main(String[] args) {
        String michaelJackson = new String("Jackson");
        String jessyJackson = new String("Jackson");
        // michaelJackson と jessyJackson を比較して
        // 等しければ「等しい」と表示する処理をここに書く
        if (michaelJackson.equals(jessyJackson)) {
            System.out.println("等しい");
        }
    }
}
