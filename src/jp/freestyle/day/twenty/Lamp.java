package jp.freestyle.day.twenty;

class Lamp {
    private String name;
    private boolean isOn;

    public Lamp(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
        showState();
    }

    public void turnOff() {
        this.isOn = false;
        showState();
    }

    public void showState() {
        if (this.isOn) {
            System.out.format("%s の明かりがついてます %n", this.name);
            return;
        }
        System.out.format("%s の明かりが消えています %n", this.name);
    }
}