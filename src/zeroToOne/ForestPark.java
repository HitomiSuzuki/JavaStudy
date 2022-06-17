package zeroToOne;

public class ForestPark {
    public static void main(String[] args) {
        Tree palmTree = new Tree(56);
        palmTree.showAge();
    }
}

class Tree {
    private int age;

    public Tree(int age) {
        this.age = age;
    }

    public void showAge() {
        System.out.format("樹齢は %d 年です", this.age);
    }
}