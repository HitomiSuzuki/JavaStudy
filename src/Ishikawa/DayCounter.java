package Ishikawa;

public class DayCounter {
    public static void main(String[] args) throws Exception {

        int END_DAY = 27;

        // 初期値1 END_DAYと同数になった場合停止 ++は1ずつ追加
        for (int i = 1; END_DAY >= i; i++) {
            System.out.println(i + "日目");
        }
    }
}
