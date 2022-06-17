package Ishikawa;

//6日目 入力された文字列を表示する

import java.util.Scanner;

public class StringInputReciever {
    public static void main(String[] args) {
        System.out.print("名前を入力してください：");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.print("入力された名前は" + name + "です");

        sc.close(); // クローズ処理。なくてもいいが、エラーメッセージとして出るので書きました。
    }
}
