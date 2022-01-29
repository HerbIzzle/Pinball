package designpattern.composite;

public class Flipper implements GameElement {

    public void hitBall() {
        System.out.println("Swooosh");
    }


    @Override
    public void hitSlingshot() {

    }

    @Override
    public void hitTarget() {

    }

    @Override
    public void hitBumper() {

    }

    @Override
    public void openRamp() {

    }

    @Override
    public void closeRamp() {

    }
}

