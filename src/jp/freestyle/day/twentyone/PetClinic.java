package jp.freestyle.day.twentyone;

public class PetClinic {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("山本一郎", 3, "プードル"),
                new Dog("山田次郎", 1, "ブルドッグ"),
                new Dog("山下三郎", 75, "秋田犬"),
        };
        for (Dog dog : dogs) {
            dog.introduce();
        }
    }
}
