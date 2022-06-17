package Ishikawa;
//3日目 文字列を改行させずに出力をしよう

public class StringLinePrinter { // ファイル名とクラス名は同じに
    public static void main(String[] args) throws Exception {

        String firstBlock = "AAA"; // 変数firstBlockにAAAを格納
        String secondBlock = "bbbb"; // 変数secondBlockにbbbbを格納
        String thiedBlock = "CCCCC"; // 変数tihrdBlockにCCCCCCを格納

        System.out.print(firstBlock); // printlnは改行する
        System.out.print(secondBlock); // printは改行しない
        System.out.print(thiedBlock);

    }
}