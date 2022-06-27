package jp.freestyle.day.twentyfour;

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
