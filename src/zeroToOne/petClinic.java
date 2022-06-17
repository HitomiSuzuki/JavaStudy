package zeroToOne;

public class petClinic {
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

class Dog {
    String name;
    int age;
    String type;

    public Dog(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void introduce() {
        System.out.printf("%s の %s は %d 歳です%n", this.type, this.name, this.age);
    }
}