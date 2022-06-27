package guess.card.game.logic;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class GuessCardGameLogic {
    private final String[] PATTERN = new String[] { "ハート", "ダイヤ", "スペード", "クローバー" };
    private final String[] NUMBER = new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    private int selectedPatternIndex;
    private int selectedNumberIndex;
    private boolean isPatternCorrect = false;
    private boolean isNumberCorrect = false;
    private Random rnd = new Random();
    private Scanner scanner = new Scanner(System.in);

    public void playGame() {

        this.selectedPatternIndex = rnd.nextInt(3);
        this.selectedNumberIndex = rnd.nextInt(12);

        System.out.printf("pattern is %d", this.selectedPatternIndex);
        System.out.printf("number is %d", this.selectedNumberIndex);

        System.out.println("トランプを選んだよ");
        System.out.println("トランプの図柄を当ててね");
        System.out.printf("0:ハート%n1:ダイヤ%n2:スペード%n3:クローバー%n");

        System.out.println("どれだと思う？");

        checkPattern();

        System.out.println("次は数字を当ててね");
        System.out.println("どれだと思う？");

        checkNumber();

    }

    private void checkPattern() {
        while (!this.isPatternCorrect) {

            try {
                int inputtedPatternIndex = scanner.nextInt();
                if (!isValidPatternIndex(inputtedPatternIndex)) {
                    System.out.println("0~3の数字を入力してください");
                    continue;
                }
                if (inputtedPatternIndex != this.selectedPatternIndex) {
                    System.out.printf("残念！%sじゃないよ", PATTERN[inputtedPatternIndex]);
                    continue;
                }

                System.out.printf("正解！図柄は%sだよ%n", PATTERN[this.selectedPatternIndex]);
                this.isPatternCorrect = true;

            } catch (InputMismatchException e) {
                System.out.println("数字で入力してください");
                scanner.next();
            }

        }
    }

    private void checkNumber() {
        while (!this.isNumberCorrect) {

            // String inputtedNumberIndex = scanner.next();

            // if (!isValidNumberIndex(inputtedNumberIndex)) {
            // System.out.println("0~12の数字を入力してください");
            // continue;
            // }
            // if (inputtedNumberIndex.equals(this.selectedNumberIndex)) {
            // System.out.printf("残念！%sじゃないよ", inputtedNumberIndex);
            // continue;
            // }

            System.out.printf("正解！%sの%sだよ%n", PATTERN[this.selectedPatternIndex], NUMBER[this.selectedNumberIndex]);
            this.isNumberCorrect = true;

            scanner.close();
        }
    }

    public boolean isValidPatternIndex(int i) {
        if (i >= 0 && i <= 3)
            return true;
        return false;
    }

    public boolean isValidNumberIndex(String i) {
        ArrayList<String> number = new ArrayList<String>(Arrays.asList(NUMBER));
        if (number.contains(i))
            return true;
        return false;
    }

}
