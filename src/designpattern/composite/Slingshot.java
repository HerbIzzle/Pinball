package designpattern.composite;

public class Slingshot implements GameElement {
    public Slingshot() {
    }
    public void hitSlingshot() { System.out.println("You hit a Slingshot!");}

    @Override
    public void hitTarget() {}
    @Override
    public void hitBumper() {}
    @Override
    public void openRamp() {}
    @Override
    public void closeRamp() {}
}
