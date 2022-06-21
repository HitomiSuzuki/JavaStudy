package zeroToOne.StationaryShop2;

public class StationaryShop2 {

    public static void main(String[] args) {
        Amount myCart = new Amount(0);

        Stationary ballPen = new Stationary(
                "三菱ジェットストリーム", new Amount(120), 3);

        Stationary eraser = new Stationary(
                "MONO消しゴム", new Amount(80), 2);
        myCart = myCart.add(ballPen.calcTotalAmount());
        myCart = myCart.add(eraser.calcTotalAmount());
        myCart = myCart.addTax();
        myCart.showValue();
    }

}



