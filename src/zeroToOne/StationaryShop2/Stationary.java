package zeroToOne.StationaryShop2;

public class Stationary {
    private String name;
    private Amount amount;
    private int num;

    public Stationary(String name, Amount amount, int num) {
        this.name = name;
        this.amount = amount;
        this.num = num;
    }

    public int calcTotalAmount() {
        int price = this.amount.price * this.num;
        System.out.printf("%sが%d本あります。%n", this.name, this.num);
        return price;
    }
}
