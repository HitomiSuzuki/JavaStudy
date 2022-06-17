package zeroToOne;

public class StationaryShop2 {

    public static void main(String[] args) {
        Amount2 myCart = new Amount2(0);

        Stationary ballPen = new Stationary(
                "三菱ジェットストリーム", new Amount2(120), 3);

        Stationary eraser = new Stationary(
                "MONO消しゴム", new Amount2(80), 2);
        System.out.println(ballPen.calcTotalAmount());
        myCart = myCart.add(ballPen.calcTotalAmount());
        myCart = myCart.add(eraser.calcTotalAmount());
        myCart = myCart.addTax();
        myCart.showValue();
    }

}

class Amount2 {
    public int price;
    private double priceWithTax;

    public Amount2(int price) {
        this.price = price;
    }

    public Amount2 add(int price) {
        this.price = this.price + price;
        return this;
    }

    public Amount2 addTax() {
        this.priceWithTax = this.price * 1.08;
        return this;
    }

    public void showValue() {
        System.out.printf("金額は %.0f 円 です", this.priceWithTax);
    }
}

class Stationary {
    // private String name;
    private Amount2 amount;
    private int num;

    public Stationary(String name, Amount2 amount, int num) {
        // this.name = name;
        this.amount = amount;
        this.num = num;
    }

    public int calcTotalAmount() {
        int price = this.amount.price * this.num;
        return price;
    }
}
