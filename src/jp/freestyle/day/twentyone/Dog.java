package jp.freestyle.day.twentyone;

public class Dog {
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