package jp.freestyle.day.twentythree;

public class Tree {
    private int age;

    public Tree(int age) {
        this.age = age;
    }

    public void showAge() {
        System.out.format("樹齢は %d 年です", this.age);
    }
}
