package Ishikawa;
//4日目　文字列に変数の内容を埋め込んで出力をしよう

public class LendMoneyPrinter {
    public static void main(String[] args) throws Exception {

        String name = "山本太郎"; // 変数nameに山本太郎を入れる
        String money = "100";

        System.out.print(name);
        System.out.print("さん、"); // 変数 + ”文字列” という書き方でも可
        System.out.print(money);
        System.out.print("円を貸してください");

    }
}
