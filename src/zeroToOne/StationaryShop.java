package zeroToOne;

public class StationaryShop {
    public static void main(String[] args) {
        Amount myCart = new Amount(0);
        Amount ballPen = new Amount(120);
        Amount eraser = new Amount(80);
        myCart = myCart.add(ballPen);
        myCart = myCart.add(eraser);
        myCart = myCart.addTax();
        myCart.showValue();
    }

}

class Amount {
    public int price;
    private double priceWithTax;

    public Amount(int price) {
        this.price = price;
    }

    public Amount add(Amount Item) {
        this.price = this.price + Item.price;
        return this;
    }

    public Amount addTax() {
        this.priceWithTax = this.price * 1.08;
        return this;
    }

    public void showValue() {
        System.out.printf("金額は %.0f 円 です", this.priceWithTax);
    }
}
