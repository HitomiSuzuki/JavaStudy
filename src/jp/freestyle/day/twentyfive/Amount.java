package jp.freestyle.day.twentyfive;

public class Amount {
    public int price;
    private double priceWithTax;

    public Amount(int price) {
        this.price = price;
    }

    public Amount add(int price) {
        this.price = this.price + price;
        return this;
    }

    public Amount addTax() {
        this.priceWithTax = this.price * 1.08;
        return this;
    }

    public void showValue() {
        System.out.printf("金額は %.0f 円 です。%n", this.priceWithTax);
    }
}