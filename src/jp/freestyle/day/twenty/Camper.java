package jp.freestyle.day.twenty;

public class Camper {
    public static void main(String[] args) {
        Lamp ledLamp = new Lamp("LED ランプ");
        Lamp halogenLamp = new Lamp("ハロゲンランプ");

        ledLamp.turnOff();
        ledLamp.showState();
        halogenLamp.turnOff();
        halogenLamp.turnOn();
    }
}
